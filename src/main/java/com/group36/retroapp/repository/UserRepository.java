package com.group36.retroapp.repository;

import com.group36.retroapp.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User,Integer> {
    //фильтр запроса определяется наименованием метода
    //здесь в итоге будет SELECT * FROM users WHERE LOGIN = '&login'
    User getUserByLogin(String login);
}
