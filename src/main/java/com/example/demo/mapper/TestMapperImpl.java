//package com.example.demo.mapper;
//
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Map;
//
//@Repository
//public class TestMapperImpl implements TestMapper {
//
//    private final SqlSession sqlSession;
//
////    public TestMapperImpl(SqlSession sqlSession) {
////        this.sqlSession = sqlSession;
////    }
//
//    @Autowired
//    public TestMapperImpl(SqlSessionFactory sqlSessionFactory) {
//        this.sqlSession = sqlSessionFactory.openSession();
//    }
//
//    @Override
//    public List<Map<String, Object>> getList() {
//        return sqlSession.selectList("com.example.demo.mapper.TestMapper.getList");
//    }
//}
