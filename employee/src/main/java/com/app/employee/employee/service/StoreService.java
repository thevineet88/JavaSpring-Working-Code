package com.app.employee.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.employee.employee.model.Store;
import com.app.employee.employee.repository.StoreRepository;

@Service
public class StoreService {

	@Autowired
	StoreRepository storeRepository;
	
	public void saveStore(Store store) {
		storeRepository.save(store);
	}
	
	public List<Store> getAllStore()
	{
		List<Store> store = new ArrayList<>();
		storeRepository.findAll().forEach(e -> store.add(e));
		return store;
	}

}
