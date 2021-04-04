package com.group36.retroapp.service;

import com.group36.retroapp.model.User;
import com.group36.retroapp.repository.UserRepository;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class UserService{
    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //выборка пользователей по страницам
    public List<User> getAll(int pageNumber,int pageSize,String sortBy){
        //формируем страничный запрос
        Pageable paging = PageRequest.of(pageNumber,pageSize, Sort.by(sortBy));
        Page<User> pageResult = userRepository.findAll(paging);
        //если есть записи - возвращаем их
        if(pageResult.hasContent()){
            return pageResult.getContent();
        }else{
            //иначе - возвращаем пустой список
            return new ArrayList<>();
        }
    }

    public User getById(int id){
        return userRepository.findById(id).orElse(null);
    }

    @Transactional
    public User save(User user){
        return userRepository.save(user);
    }

    @Transactional
    public boolean deleteById(int id){
        userRepository.deleteById(id);
        return true;
    }

    public User getByLogin(String login){
        return userRepository.getUserByLogin(login);
    }

    public Iterable<User> getAllSortByLogin(){
        return userRepository.findAll(Sort.by("login"));
    }
}
