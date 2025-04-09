package dao;

import dto.PointDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PointDao {
    @Autowired
    private SqlSession sqlSession;
    private final String NAMESPACE = "mapper.PointMapper";

    public int insert(PointDto dto){
        return sqlSession.insert(NAMESPACE + ".insert", dto);
    }
    public int delete(int num){
        return 0;
    }
    public int update(PointDto dto){
        return 0;
    }
}
