package com.mdf.pma.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.mdf.pma.entities.UserAccount;

public interface UserAccountRepository extends PagingAndSortingRepository<UserAccount, Long>{

}
