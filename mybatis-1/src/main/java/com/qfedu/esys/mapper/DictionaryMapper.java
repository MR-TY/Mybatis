package com.qfedu.esys.mapper;

import java.util.List;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import com.qfedu.esys.entity.Dictionary;

public interface DictionaryMapper {
	public List<Dictionary> findAllDictionary();

	public Dictionary findOneDictionaryById(String id);

	public void createOneDictionary(Dictionary dictionary);
	
	public void deleteDictionaryById(String id);
	
	public void updateDictionary(Dictionary dictionary);
}
