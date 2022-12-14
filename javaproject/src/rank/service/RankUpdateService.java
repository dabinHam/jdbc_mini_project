package rank.service;

import java.sql.Connection;
import java.sql.SQLException;

import generic.GenericUtil;
import rank.Rank;
import rank.RankDao;
import rank.RankDaoOracle;

public class RankUpdateService {


	RankDao dao = new RankDaoOracle();
	
	public void update(int index, int score, String cleardate) {
		// TODO Auto-generated method stub

		Connection conn = null;
		try {
			conn = GenericUtil.getConnection();
			
			dao.update(conn,index, score, cleardate);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(conn != null)
			{
				try {
					conn.close();
				} 
				catch (SQLException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
