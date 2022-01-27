package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.cj.x.protobuf.MysqlxCrud.Find;
import com.ty.dto.InVoice;
import com.ty.dto.Item;

public class ItemVoice {

       
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
	    EntityManager entityManager=entityManagerFactory.createEntityManager();
	    EntityTransaction entityTransaction=entityManager.getTransaction();

	public void insertItems(InVoice invoice, Item item) {
		entityTransaction.begin();

		entityManager.persist(item);
		entityManager.persist(invoice);

		entityTransaction.commit();
	}

	public InVoice getItems(int id) {
		InVoice invoice = entityManager.find(InVoice.class, id);
		invoice.getItem();
		return invoice;
	}

	public InVoice updateItems(int id) {
		entityTransaction.begin();
		InVoice invoice = entityManager.find(InVoice.class, id);
		if(id==invoice.getId())
		invoice.getItem();
		entityManager.merge(invoice);
		entityTransaction.commit();
		return invoice;

	}

	public void deleteItems(int id) {
		entityTransaction.begin();
		InVoice invoice = entityManager.find(InVoice.class, id);
		invoice.getItem();
		if(invoice!=null) {
		entityManager.remove(invoice);
		entityTransaction.commit();
		}
	}

}
