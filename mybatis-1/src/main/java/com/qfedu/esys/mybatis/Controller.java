package com.qfedu.esys.mybatis;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.lf5.util.Resource;

import com.qfedu.esys.entity.Dictionary;
import com.qfedu.esys.mapper.DictionaryMapper;

public class Controller {
	private final static Logger LOG = LogManager.getLogger(Controller.class);
	public static void main(String[] args) throws IOException {
		//获取配置文件
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		
		//得到sqlsession的工厂
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		//获取session
		SqlSession session = sessionFactory.openSession();
		
		//方式一：获取对象
		Dictionary dictionary  = session.selectOne("com.qfedu.esys.mapper.DictionaryMapper.findOneDictionaryById", "1");
		LOG.info("名字："+dictionary.getName());
		
		//方式二：通过mapper获取
		DictionaryMapper mapper =  session.getMapper(DictionaryMapper.class);
		Dictionary dictionary2 = mapper.findOneDictionaryById("1");
		LOG.info(dictionary2);
		
		List<Dictionary> dictionaries = mapper.findAllDictionary();
		LOG.info("全部："+dictionaries);
		
		Dictionary dic1= new Dictionary();
		dic1.setId("5");
		dic1.setDescription("bb");
		dic1.setDicType("ee");
		dic1.setName("ab");
		dic1.setVal("123");
		mapper.createOneDictionary(dic1);
		
		mapper.deleteDictionaryById("2");
	}
}
