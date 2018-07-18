package com.stackfing.service;

import com.stackfing.pojo.Customer;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 上午10:32 18-1-28
 * @see com.stackfing.service.serviceImpl.CustomerServiceImpl
 */
public interface CustomerService {

	Customer updateInformation(Long id, Customer customer);

	Customer findById(Long id);

	Customer findByAccount(String account);

	List<Customer> findAll();

}
