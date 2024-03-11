package com.example.mydiary.services;

import java.util.List;

import com.example.mydiary.entity.Entry;

public interface EntryService {

	public Entry saveEntry(Entry entry);
	public Entry updateEntry(Entry entry);
	public Entry findById(long id);
	public void deleteEntry(Entry entry);
	public List<Entry> findAll();
	public List<Entry> findByUserid(long id);
}
