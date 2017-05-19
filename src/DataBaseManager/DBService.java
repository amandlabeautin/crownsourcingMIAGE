package DataBaseManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import DataBean.Attribut;
import DataBean.Pair;
import DataBean.RandomPair;
import DataBean.SimilarPair;
import Utils.Utils;

public class DBService {

	public static void INIT_DB(){
		String sqlPair = "DELETE FROM `pair` WHERE 1";
		PreparedStatement statementPair;
		try {
			statementPair = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlPair);
			statementPair.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sqlPair2 = "ALTER TABLE pair AUTO_INCREMENT = 1";
		PreparedStatement statementPair2;
		try {
			statementPair2 = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlPair2);
			statementPair2.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String sqlAttribut = "DELETE FROM `attribut` WHERE 1";
		PreparedStatement statementAttribut;
		try {
			statementAttribut = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlAttribut);
			statementAttribut.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sqlAttribut2 = "ALTER TABLE attribut AUTO_INCREMENT = 1";
		PreparedStatement statementAttribut2;
		try {
			statementAttribut2 = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlAttribut2);
			statementAttribut2.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sqlsimilarite_r = "DELETE FROM `similarite_r` WHERE 1";
		PreparedStatement statementsimilarite_r;
		try {
			statementsimilarite_r = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlsimilarite_r);
			statementsimilarite_r.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sqlsimilarite_r2 = "ALTER TABLE similarite_r AUTO_INCREMENT = 1";
		PreparedStatement statementsimilarite_r2;
		try {
			statementsimilarite_r2 = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlsimilarite_r2);
			statementsimilarite_r2.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sqlsimilarite_r_prime = "DELETE FROM `similarite_r_prime` WHERE 1";
		PreparedStatement statementsimilarite_r_prime;
		try {
			statementsimilarite_r_prime = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlsimilarite_r_prime);
			statementsimilarite_r_prime.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sqlsimilarite_r_prime2 = "ALTER TABLE similarite_r_prime AUTO_INCREMENT = 1";
		PreparedStatement statementsimilarite_r_prime2;
		try {
			statementsimilarite_r_prime2 = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlsimilarite_r_prime2);
			statementsimilarite_r_prime2.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String sqlpre_traitement = "DELETE FROM `pre_traitement` WHERE 1";
		PreparedStatement statementpre_traitement;
		try {
			statementpre_traitement = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlpre_traitement);
			statementpre_traitement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sqlpre_traitement2 = "ALTER TABLE pre_traitement AUTO_INCREMENT = 1";
		PreparedStatement statementpre_traitement2;
		try {
			statementpre_traitement2 = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlpre_traitement2);
			statementpre_traitement2.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String sqlsimilarite_r_remaster = "DELETE FROM `similarite_r_remaster` WHERE 1";
		PreparedStatement statementsimilarite_r_remaster;
		try {
			statementsimilarite_r_remaster = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlsimilarite_r_remaster);
			statementsimilarite_r_remaster.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sqlsimilarite_r_remaster2 = "ALTER TABLE similarite_r_remaster AUTO_INCREMENT = 1";
		PreparedStatement statementsimilarite_r_remaster2;
		try {
			statementsimilarite_r_remaster2 = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlsimilarite_r_remaster2);
			statementsimilarite_r_remaster2.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String sqlsimilarite_r_prime_remaster = "DELETE FROM `similarite_r_prime_remaster` WHERE 1";
		PreparedStatement statementsimilarite_r_prime_remaster;
		try {
			statementsimilarite_r_prime_remaster = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlsimilarite_r_prime_remaster);
			statementsimilarite_r_prime_remaster.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sqlsimilarite_r_prime_remaster2 = "ALTER TABLE similarite_r_prime_remaster AUTO_INCREMENT = 1";
		PreparedStatement statementsimilarite_r_prime_remaster2;
		try {
			statementsimilarite_r_prime_remaster2 = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlsimilarite_r_prime_remaster2);
			statementsimilarite_r_prime_remaster2.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sqlTableAttributApriori = "DELETE FROM `attribut_apriori` WHERE 1";
		PreparedStatement statementTableAttributApriori;
		try {
			statementTableAttributApriori = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlTableAttributApriori);
			statementTableAttributApriori.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sqlTableAttributApriori2 = "ALTER TABLE attribut_apriori AUTO_INCREMENT = 1";
		PreparedStatement statementTableAttributApriori2;
		try {
			statementTableAttributApriori2 = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlTableAttributApriori2);
			statementTableAttributApriori2.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String sqlTablematching_dependencieOne = "DELETE FROM `md_temp_one_entity` WHERE 1";
		PreparedStatement statementTablematching_dependencieOne;
		try {
			statementTablematching_dependencieOne = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlTablematching_dependencieOne);
			statementTablematching_dependencieOne.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sqlTablematching_dependencieOne2 = "ALTER TABLE md_temp_one_entity AUTO_INCREMENT = 1";
		PreparedStatement statementTablematching_dependencieOne2;
		try {
			statementTablematching_dependencieOne2 = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlTablematching_dependencieOne2);
			statementTablematching_dependencieOne2.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String sqlTablematching_dependencieTwo = "DELETE FROM `md_temp_apriori_remaster` WHERE 1";
		PreparedStatement statementTablematching_dependencieTwo;
		try {
			statementTablematching_dependencieTwo = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlTablematching_dependencieTwo);
			statementTablematching_dependencieTwo.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sqlTablematching_dependencieTwo2 = "ALTER TABLE md_temp_apriori_remaster AUTO_INCREMENT = 1";
		PreparedStatement statementTablematching_dependencieTwo2;
		try {
			statementTablematching_dependencieTwo2 = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlTablematching_dependencieTwo2);
			statementTablematching_dependencieTwo2.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String sqlTablematching_dependencie = "DELETE FROM `matching_dependencie` WHERE 1";
		PreparedStatement statementTablematching_dependencie;
		try {
			statementTablematching_dependencie = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlTablematching_dependencie);
			statementTablematching_dependencie.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sqlTablematching_dependencie2 = "ALTER TABLE matching_dependencie AUTO_INCREMENT = 1";
		PreparedStatement statementTablematching_dependencie2;
		try {
			statementTablematching_dependencie2 = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlTablematching_dependencie2);
			statementTablematching_dependencie2.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

	public static void INSERT_PAIR(Pair p){
		String sql = "INSERT INTO pair (Entry1, Entry2) VALUES (?, ?)";
		 
		PreparedStatement statement;
		try {
			statement = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, p.getObj1());
			statement.setString(2, p.getObj2());
			 
	        int affectedRows = statement.executeUpdate();
	        if (affectedRows == 0) {
	            throw new SQLException("Creating user failed, no rows affected.");
	        }

	        try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
	            if (generatedKeys.next()) {
	                p.setId(generatedKeys.getInt(1));
	            }
	            else {
	                throw new SQLException("Creating user failed, no ID obtained.");
	            }
	        }
	        
			for (Attribut a : p.getListAttribut()) {
				INSERT_ATTRIBUT(a, p.getId());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void INSERT_MATCHING_DEPENDENCIE_ONE_ENTITY(Pair p){
		String sql = "INSERT INTO md_temp_one_entity (Entry1, Entry2) VALUES (?, ?)";
		 
		PreparedStatement statement;
		try {
			statement = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, p.getObj1());
			statement.setString(2, p.getObj2());
			 
	        int affectedRows = statement.executeUpdate();
	        if (affectedRows == 0) {
	            throw new SQLException("Creating user failed, no rows affected.");
	        }

	        try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
	            if (generatedKeys.next()) {
	                p.setId(generatedKeys.getInt(1));
	            }
	            else {
	                throw new SQLException("Creating user failed, no ID obtained.");
	            }
	        }
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	public static void DELETE_MATCHING_DEPENDENCIE_ONE_ENTITY(Pair p){	
		String sqlUpdate = "DELETE FROM md_temp_one_entity WHERE id = ?";
		PreparedStatement statementUpdate;
		try {
			statementUpdate = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlUpdate);
			statementUpdate.setInt(1, p.getId());
			statementUpdate.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Pair> SELECT_ALL_MATCHING_DEPENDENCIE_ONE_ENTITY(){	

		String sqlSelect = "SELECT * FROM md_temp_one_entity";
		PreparedStatement statementSelect;
		ArrayList<Pair> listmd_temp_one_entity = new ArrayList<>();
		try {
			statementSelect = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlSelect);
			ResultSet resSelect = statementSelect.executeQuery();
			Pair pair = new Pair();
			while(resSelect.next()){
				pair = new Pair();
				pair.setId(resSelect.getInt(1));
				pair.setObj1(resSelect.getString(2));
				pair.setObj2(resSelect.getString(3));	
				listmd_temp_one_entity.add(pair);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listmd_temp_one_entity;
	}

	public static void INSERT_MATCHING_DEPENDENCIE_REMASTER(Pair p){
		String sql = "INSERT INTO md_temp_apriori_remaster (Entry1, Entry2) VALUES (?, ?)";
		 
		PreparedStatement statement;
		try {
			statement = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, p.getObj1());
			statement.setString(2, p.getObj2());
			 
	        int affectedRows = statement.executeUpdate();
	        if (affectedRows == 0) {
	            throw new SQLException("Creating user failed, no rows affected.");
	        }

	        try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
	            if (generatedKeys.next()) {
	                p.setId(generatedKeys.getInt(1));
	            }
	            else {
	                throw new SQLException("Creating user failed, no ID obtained.");
	            }
	        }
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	public static void DELETE_MATCHING_DEPENDENCIE_REMASTER(Pair p){	
		String sqlUpdate = "DELETE FROM md_temp_apriori_remaster WHERE id = ?";
		PreparedStatement statementUpdate;
		try {
			statementUpdate = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlUpdate);
			statementUpdate.setDouble(1, p.getId());
			statementUpdate.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void INSERT_MATCHING_DEPENDENCIE(Pair p){
		String sql = "INSERT INTO matching_dependencie (Entry1, Entry2) VALUES (?, ?)";
		 
		PreparedStatement statement;
		try {
			statement = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, p.getObj1());
			statement.setString(2, p.getObj2());
			 
	        int affectedRows = statement.executeUpdate();
	        if (affectedRows == 0) {
	            throw new SQLException("Creating user failed, no rows affected.");
	        }

	        try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
	            if (generatedKeys.next()) {
	                p.setId(generatedKeys.getInt(1));
	            }
	            else {
	                throw new SQLException("Creating user failed, no ID obtained.");
	            }
	        }
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public static ArrayList<Pair> SELECT_ALL_MATCHING_DEPENDENCIE(){	

		String sqlSelect = "SELECT * FROM matching_dependencie";
		PreparedStatement statementSelect;
		ArrayList<Pair> listmatching_dependencie = new ArrayList<>();
		try {
			statementSelect = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlSelect);
			ResultSet resSelect = statementSelect.executeQuery();
			Pair pair = new Pair();
			while(resSelect.next()){
				pair = new Pair();
				pair.setId(resSelect.getInt(1));
				pair.setObj1(resSelect.getString(2));
				pair.setObj2(resSelect.getString(3));	
				listmatching_dependencie.add(pair);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listmatching_dependencie;
	}

	public static void DELETE_MATCHING_DEPENDENCIE(Pair p){	
		String sqlUpdate = "DELETE FROM matching_dependencie WHERE id = ?";
		PreparedStatement statementUpdate;
		try {
			statementUpdate = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlUpdate);
			statementUpdate.setDouble(1, p.getId());
			statementUpdate.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Pair> SELECT_ALL_MATCHING_DEPENDENCIE_REMASTER(){	

		String sqlSelect = "SELECT * FROM md_temp_apriori_remaster";
		PreparedStatement statementSelect;
		ArrayList<Pair> listmd_temp_apriori_remaster = new ArrayList<>();
		try {
			statementSelect = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlSelect);
			ResultSet resSelect = statementSelect.executeQuery();
			Pair pair = new Pair();
			while(resSelect.next()){
				pair = new Pair();
				pair.setId(resSelect.getInt(1));
				pair.setObj1(resSelect.getString(2));
				pair.setObj2(resSelect.getString(3));	
				listmd_temp_apriori_remaster.add(pair);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listmd_temp_apriori_remaster;
	}
		
	public static void INSERT_ATTRIBUT(Attribut a, int idPair){
				
		String sqlSelect = "SELECT * FROM attribut WHERE PairId = ? and nomAttribut = ?";
		PreparedStatement statementSelect;
		boolean exist = false;
		try {
			statementSelect = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlSelect);
			statementSelect.setInt(1, idPair);
			statementSelect.setString(2, a.getNomAttribut());
			ResultSet resSelect = statementSelect.executeQuery();
			while(resSelect.next()) {
				exist = true;
				String sqlUpdate = "UPDATE attribut SET val = ?, nbrVote = ? WHERE PairId = ? and nomAttribut = ?";
				PreparedStatement statementUpdate;
				try {
					statementUpdate = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlUpdate);
					statementUpdate.setDouble(1, a.getVal());
					statementUpdate.setDouble(2, resSelect.getInt(6) + 1);
					statementUpdate.setInt(3, idPair);
					statementUpdate.setString(4, a.getNomAttribut());
					statementUpdate.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(!exist){
			String sql = "INSERT INTO attribut(PairId, nomAttribut, Attr1, Attr2, Val, nbrVote) VALUES (?,?,?,?,?,?)";
			
			PreparedStatement statement;
			try {
				statement = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				statement.setInt(1, idPair);
				statement.setString(2, a.getNomAttribut());
				statement.setString(3, a.getElem1());
				statement.setString(4, a.getElem2());
				statement.setDouble(5, a.getVal());
				statement.setDouble(6, a.getNbrVote());
				
				int affectedRows = statement.executeUpdate();
		        if (affectedRows == 0) {
		            throw new SQLException("Creating user failed, no rows affected.");
		        }

		        try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
		            if (generatedKeys.next()) {
		                a.setId(generatedKeys.getInt(1));
		            }
		            else {
		                throw new SQLException("Creating user failed, no ID obtained.");
		            }
		        }
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static Attribut INSERT_ATTRIBUT_R_APRIORI(Attribut a, int idPair){
				
		String sql = "INSERT INTO attribut_apriori(PairId, nomAttribut, Attr1, Attr2, Val, nbrVote) VALUES (?,?,?,?,?,?)";
		PreparedStatement statement;
		Attribut newAttr = null;
		try {
			statement = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			statement.setInt(1, idPair);
			statement.setString(2, a.getNomAttribut());
			statement.setString(3, a.getElem1());
			statement.setString(4, a.getElem2());
			
			String elem1 = a.getElem1().trim();
			String elem2 = a.getElem2().trim();
			double val = Utils.minDistance(elem1, elem2);
			double mult = 0.1;
			val = (1 - (val * mult));
			val = Double.parseDouble(new DecimalFormat("#.#").format(val).replace(',', '.'));
			if(val < 0)
				val = 0;
			
			statement.setDouble(5, val);
			statement.setDouble(6, a.getNbrVote());
			
			newAttr = new Attribut(a.getP(), a.getElem1(), a.getElem2(), val, a.getNbrVote());
			
			int affectedRows = statement.executeUpdate();
	        if (affectedRows == 0) {
	            throw new SQLException("Creating user failed, no rows affected.");
	        }

	        try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
	            if (generatedKeys.next()) {
	            	newAttr.setId(generatedKeys.getInt(1));
	            }
	            else {
	                throw new SQLException("Creating user failed, no ID obtained.");
	            }
	        }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return newAttr;
	}
		
	public static void INSERT_PAIR_TABLE_PRE_TRAITEMENT(Pair p){
		String sql = "INSERT INTO pre_traitement (idPair, idAttribut1, idAttribut2, idAttribut3, idAttribut4, idAttribut5, moySimilar) VALUES (?,?,?,?,?,?,?)";
				
		PreparedStatement statement;
		try {
			statement = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sql);
			statement.setInt(1, p.getId());
			
			Attribut attr1 = p.getListAttribut().get(0);
			statement.setInt(2, attr1.getId());
			Attribut attr2 = p.getListAttribut().get(1);
			statement.setInt(3, attr2.getId());
			Attribut attr3 = p.getListAttribut().get(2);
			statement.setInt(4, attr3.getId());
			Attribut attr4 = p.getListAttribut().get(3);
			statement.setInt(5, attr4.getId());
			Attribut attr5 = p.getListAttribut().get(4);
			statement.setInt(6, attr5.getId());
			double moySim = ((attr1.getVal() * attr1.getNbrVote()) + (attr2.getVal() * attr2.getNbrVote()) + (attr3.getVal() * attr3.getNbrVote()) + (attr4.getVal() * attr4.getNbrVote()) + (attr5.getVal() * attr5.getNbrVote())) / (attr1.getNbrVote() + attr2.getNbrVote() + attr3.getNbrVote() + attr4.getNbrVote() + attr5.getNbrVote());

			statement.setDouble(7, moySim);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static double INSERT_PAIR_TABLE_SIMILARITE(Pair p){
		String sqlSelect = "SELECT * FROM similarite_r WHERE idPair = ?";
		PreparedStatement statementSelect;
		int nbrVote = 1;
		double moySim = 0;
		boolean exist = false;
		try {
			statementSelect = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlSelect);
			statementSelect.setInt(1, p.getId());
			ResultSet resSelect = statementSelect.executeQuery();
			while(resSelect.next()) {
				exist = true;
				nbrVote = resSelect.getInt(9);
				nbrVote++;
				String sqlUpdate = "UPDATE similarite_r SET moySimilar = ?, nbrVote = ? WHERE idPair = ?";
				PreparedStatement statementUpdate;
				try {
					statementUpdate = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlUpdate);
					Attribut attr1 = p.getListAttribut().get(0);
					Attribut attr2 = p.getListAttribut().get(1);
					Attribut attr3 = p.getListAttribut().get(2);
					Attribut attr4 = p.getListAttribut().get(3);
					Attribut attr5 = p.getListAttribut().get(4);
					moySim = ((attr1.getVal() * attr1.getNbrVote()) + (attr2.getVal() * attr2.getNbrVote()) + (attr3.getVal() * attr3.getNbrVote()) + (attr4.getVal() * attr4.getNbrVote()) + (attr5.getVal() * attr5.getNbrVote())) / (attr1.getNbrVote() + attr2.getNbrVote() + attr3.getNbrVote() + attr4.getNbrVote() + attr5.getNbrVote());
										
					statementUpdate.setDouble(1, moySim);
					statementUpdate.setDouble(2, nbrVote);
					statementUpdate.setInt(3, p.getId());
					statementUpdate.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(!exist){
			String sql = "INSERT INTO similarite_r (idPair, idAttribut1, idAttribut2, idAttribut3, idAttribut4, idAttribut5, moySimilar, nbrVote) VALUES (?,?,?,?,?,?,?,?)";
					
			PreparedStatement statement;
			try {
				statement = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sql);
				statement.setInt(1, p.getId());
				
				Attribut attr1 = p.getListAttribut().get(0);
				statement.setInt(2, attr1.getId());
				Attribut attr2 = p.getListAttribut().get(1);
				statement.setInt(3, attr2.getId());
				Attribut attr3 = p.getListAttribut().get(2);
				statement.setInt(4, attr3.getId());
				Attribut attr4 = p.getListAttribut().get(3);
				statement.setInt(5, attr4.getId());
				Attribut attr5 = p.getListAttribut().get(4);
				statement.setInt(6, attr5.getId());
				moySim = ((attr1.getVal() * attr1.getNbrVote()) + (attr2.getVal() * attr2.getNbrVote()) + (attr3.getVal() * attr3.getNbrVote()) + (attr4.getVal() * attr4.getNbrVote()) + (attr5.getVal() * attr5.getNbrVote())) / (attr1.getNbrVote() + attr2.getNbrVote() + attr3.getNbrVote() + attr4.getNbrVote() + attr5.getNbrVote());
				
				statement.setDouble(7, moySim);
				statement.setInt(8, nbrVote);
				statement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return moySim;
	}
	
	public static SimilarPair SELECT_PAIR_TABLE_SIMILARITE_BY_ID(int idPair){
		String sqlSelect = "SELECT * FROM similarite_r WHERE idPair = ?";
		PreparedStatement statementSelect;
		SimilarPair simP = new SimilarPair();
		try {
			statementSelect = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlSelect);
			statementSelect.setInt(1, idPair);
			ResultSet res = statementSelect.executeQuery();
			while(res.next()) {
	            int id = res.getInt(1);
	            int idPairNew = res.getInt(2);
	            int idAttribut1 = res.getInt(3);
	            int idAttribut2 = res.getInt(4);
	            int idAttribut3 = res.getInt(5);
	            int idAttribut4 = res.getInt(6);
	            int idAttribut5 = res.getInt(7);
	            double moySimilar = res.getDouble(8);
	            int nbrVote = res.getInt(8);

	            simP = new SimilarPair(id, idPairNew, idAttribut1, idAttribut2, idAttribut3, idAttribut4, idAttribut5, moySimilar, nbrVote);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return simP;
	}
	
	public static void INSERT_PAIR_TABLE_SIMILARITE_APRIORI(Pair p){
		double moySim = 0;		
		String sql = "INSERT INTO similarite_r_remaster (idPair, idAttribut1, idAttribut2, idAttribut3, idAttribut4, idAttribut5, moySimilar, nbrVote) VALUES (?,?,?,?,?,?,?,?)";
				
		PreparedStatement statement;
		try {
			statement = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sql);
			statement.setInt(1, p.getId());
			
			Attribut attr1 = p.getListAttribut().get(0);
			statement.setInt(2, attr1.getId());
			Attribut attr2 = p.getListAttribut().get(1);
			statement.setInt(3, attr2.getId());
			Attribut attr3 = p.getListAttribut().get(2);
			statement.setInt(4, attr3.getId());
			Attribut attr4 = p.getListAttribut().get(3);
			statement.setInt(5, attr4.getId());
			Attribut attr5 = p.getListAttribut().get(4);
			statement.setInt(6, attr5.getId());
			moySim = ((((attr1.getVal() + attr2.getVal() + attr3.getVal()  + attr4.getVal() + attr5.getVal()) / (5)) + p.getVal() ) / 2 );
			p.setVal(moySim);
			statement.setDouble(7, moySim);
			statement.setInt(8, 1);
			statement.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Attribut SELECT_ATTRIBUT(int idAttribut){
		String sql = "SELECT * FROM attribut where id = ?";

		Attribut attr = new Attribut();
		PreparedStatement statement;
		try {
			statement = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sql);
			statement.setInt(1, idAttribut);
			
			ResultSet res = statement.executeQuery();
			while (res.next()) {
				String nomAttribut = res.getString(3);
				String Attr1 = res.getString(4);
				String Attr2 = res.getString(5);
				Double Val = res.getDouble(6);
				int nbrVote = res.getInt(7);
				attr = new Attribut(null, nomAttribut, Attr1, Attr2, Val, nbrVote);
				attr.setId(res.getInt(1));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return attr;
	}
	
	public static Attribut SELECT_ATTRIBUT_APRIORI(int idAttribut){
		String sql = "SELECT * FROM attribut_apriori where id = ?";

		Attribut attr = new Attribut();
		PreparedStatement statement;
		try {
			statement = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sql);
			statement.setInt(1, idAttribut);
			
			ResultSet res = statement.executeQuery();
			while (res.next()) {
				String nomAttribut = res.getString(3);
				String Attr1 = res.getString(4);
				String Attr2 = res.getString(5);
				Double Val = res.getDouble(6);
				int nbrVote = res.getInt(7);
				attr = new Attribut(null, nomAttribut, Attr1, Attr2, Val, nbrVote);
				attr.setId(res.getInt(1));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return attr;
	}

	
	public static ArrayList<Attribut> SELECT_ALL_ATTRIBUT_FOR_PAIR(int idPair){
		String sql = "SELECT * FROM attribut where PairId = ?";
		ArrayList<Attribut> listAttribut = new ArrayList<>();
		Attribut attr = new Attribut();
		PreparedStatement statement;
		try {
			statement = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sql);
			statement.setInt(1, idPair);
			
			ResultSet res = statement.executeQuery();
			while (res.next()) {
				String nomAttribut = res.getString(3);
				String Attr1 = res.getString(4);
				String Attr2 = res.getString(5);
				Double Val = res.getDouble(6);
				int nbrVote = res.getInt(7);
				attr = new Attribut(null, nomAttribut, Attr1, Attr2, Val, nbrVote);
				attr.setId(res.getInt(1));
				listAttribut.add(attr);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listAttribut;
	}
	
	public static ArrayList<SimilarPair> SELECT_TABLE_SIMILAR_R(){
		String sql = "SELECT * FROM similarite_r";
		ArrayList<SimilarPair> listPairSimilaire = new ArrayList<>();		
		SimilarPair simP = new SimilarPair();
		PreparedStatement statement;
		try {
			statement = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sql);
			ResultSet res = statement.executeQuery();
			
			while (res.next()) {
	            int id = res.getInt(1);
	            int idPair = res.getInt(2);
	            int idAttribut1 = res.getInt(3);
	            int idAttribut2 = res.getInt(4);
	            int idAttribut3 = res.getInt(5);
	            int idAttribut4 = res.getInt(6);
	            int idAttribut5 = res.getInt(7);
	            double moySimilar = res.getDouble(8);

	            simP = new SimilarPair(id, idPair, idAttribut1, idAttribut2, idAttribut3, idAttribut4, idAttribut5, moySimilar);
	            listPairSimilaire.add(simP);
	        }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listPairSimilaire;
	}
	
	public static ArrayList<ArrayList<SimilarPair>> SELECT_TABLE_SIMILAR_R_PRIME_APRIORI(){
		String sql = "SELECT * FROM similarite_r_prime_remaster ORDER BY idPair";
		ArrayList<ArrayList<SimilarPair>> listPairSimilaire = new ArrayList<>();		
		ArrayList<SimilarPair> listPairSimilaireForId = new ArrayList<>();		
		SimilarPair simP = new SimilarPair();
		PreparedStatement statement;
		try {
			statement = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sql);
			ResultSet res = statement.executeQuery();
			int lastid = -1;
			boolean first = true;
			while (res.next()) {
	            int id = res.getInt(1);
	            int idPair = res.getInt(2);
	            int idAttribut1 = res.getInt(3);
	            int idAttribut2 = res.getInt(4);
	            int idAttribut3 = res.getInt(5);
	            int idAttribut4 = res.getInt(6);
	            int idAttribut5 = res.getInt(7);
	            int moySimilar = res.getInt(8);

	            simP = new SimilarPair(id, idPair, idAttribut1, idAttribut2, idAttribut3, idAttribut4, idAttribut5, moySimilar);
	            
	            if(idPair == lastid || first){
	            	listPairSimilaireForId.add(simP);
	            }
	            else{
	            	listPairSimilaire.add(listPairSimilaireForId);
	            	listPairSimilaireForId = new ArrayList<>();
	            	listPairSimilaireForId.add(simP);
	            }

	            lastid = idPair;
	            first = false;
	        }
		} catch (SQLException e) {
			e.printStackTrace();
		}

    	listPairSimilaire.add(listPairSimilaireForId);
		return listPairSimilaire;
	}
	
	public static void INSERT_PAIR_TABLE_SIMILARITE_PRIME(SimilarPair p){
		String sqlSelect = "SELECT * FROM similarite_r_prime WHERE idPair = ?";
		PreparedStatement statementSelect;
		boolean exist = false;
		try {
			statementSelect = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlSelect);
			statementSelect.setInt(1, p.getId());
			ResultSet resSelect = statementSelect.executeQuery();
			while(resSelect.next()) {
				exist = true;
				String sqlUpdate = "UPDATE similarite_r_prime SET idAttribut1 = ?, idAttribut2 = ?, idAttribut3 = ?, idAttribut4 = ?, idAttribut5 = ?, moySimilar = ? WHERE idPair = ?";
				PreparedStatement statementUpdate;
				try {
					statementUpdate = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlUpdate);
					statementUpdate.setDouble(1, p.getIdAttribut1());
					statementUpdate.setDouble(2, p.getIdAttribut2());
					statementUpdate.setDouble(3, p.getIdAttribut3());
					statementUpdate.setDouble(4, p.getIdAttribut4());
					statementUpdate.setDouble(5, p.getIdAttribut5());
					statementUpdate.setDouble(6, p.getMoySimilar());
					statementUpdate.setInt(7, p.getId());
					statementUpdate.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				if(p.getMoySimilar() <= 0.5){
					String sqlDelete = "DELETE FROM similarite_r_prime WHERE idPair = ?";
					PreparedStatement statementDelete;
					try {
						statementDelete = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlDelete);
						statementDelete.setInt(1, p.getId());
						statementDelete.executeUpdate();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(!exist){
			String sql = "INSERT INTO similarite_r_prime (idPair, idAttribut1, idAttribut2, idAttribut3, idAttribut4, idAttribut5, moySimilar) VALUES (?,?,?,?,?,?,?)";
			
			PreparedStatement statement;
			try {
				statement = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sql);
				statement.setInt(1, p.getId());
				statement.setInt(2, p.getIdAttribut1());
				statement.setInt(3, p.getIdAttribut2());
				statement.setInt(4, p.getIdAttribut3());
				statement.setInt(5, p.getIdAttribut4());
				statement.setInt(6, p.getIdAttribut5());
				statement.setDouble(7, p.getMoySimilar());
				
				statement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void INSERT_PAIR_TABLE_SIMILARITE_PRIME_APRIORI(SimilarPair p){
		String sqlApriori = "INSERT INTO similarite_r_prime_remaster (idPair, idAttribut1, idAttribut2, idAttribut3, idAttribut4, idAttribut5, moySimilar) VALUES (?,?,?,?,?,?,?)";
		
		PreparedStatement statement;
		try {
			statement = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sqlApriori);
			statement.setInt(1, p.getId());
			statement.setInt(2, p.getIdAttribut1());
			statement.setInt(3, p.getIdAttribut2());
			statement.setInt(4, p.getIdAttribut3());
			statement.setInt(5, p.getIdAttribut4());
			statement.setInt(6, p.getIdAttribut5());
			statement.setDouble(7, p.getMoySimilar());
			
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public static ArrayList<SimilarPair> SELECT_SIMILAR_PRIME_ONE(){
		String sql = "SELECT * FROM similarite_r_prime";
		ArrayList<SimilarPair> listPairSimilaire = new ArrayList<>();		
		SimilarPair simP = new SimilarPair();
		PreparedStatement statement;
		try {
			statement = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sql);
			ResultSet res = statement.executeQuery();
			
			while (res.next()) {
	            int id = res.getInt(1);
	            int idPair = res.getInt(2);
	            int idAttribut1 = res.getInt(3);
	            int idAttribut2 = res.getInt(4);
	            int idAttribut3 = res.getInt(5);
	            int idAttribut4 = res.getInt(6);
	            int idAttribut5 = res.getInt(7);
	            int moySimilar = res.getInt(8);

	            simP = new SimilarPair(id, idPair, idAttribut1, idAttribut2, idAttribut3, idAttribut4, idAttribut5, moySimilar);
	            listPairSimilaire.add(simP);
	        }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listPairSimilaire;
	}

	public static ArrayList<SimilarPair> SELECT_SIMILAR_PRIME_TWO(){
		String sql2 = "SELECT * FROM similarite_r_prime";
		ArrayList<SimilarPair> listPairSimilaireApriori = new ArrayList<>();		
		SimilarPair simPApriori = new SimilarPair();
		PreparedStatement statement2;
		try {
			statement2 = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sql2);
			ResultSet res2 = statement2.executeQuery();
			
			while (res2.next()) {
	            int id = res2.getInt(1);
	            int idPair = res2.getInt(2);
	            int idAttribut1 = res2.getInt(3);
	            int idAttribut2 = res2.getInt(4);
	            int idAttribut3 = res2.getInt(5);
	            int idAttribut4 = res2.getInt(6);
	            int idAttribut5 = res2.getInt(7);
	            int moySimilar = res2.getInt(8);

	            simPApriori = new SimilarPair(id, idPair, idAttribut1, idAttribut2, idAttribut3, idAttribut4, idAttribut5, moySimilar);
	            listPairSimilaireApriori.add(simPApriori);
	        }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listPairSimilaireApriori;
	}
	

	
	public static RandomPair SELECT_RANDOM_PAIR(){
		String sql = "SELECT * FROM pair ORDER BY RAND() LIMIT 1";
		RandomPair simP = null;
		PreparedStatement statement;
		try {
			statement = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sql);
			ResultSet res  = statement.executeQuery();
            double val = 0;
			
			while (res.next()) {
	            int id = res.getInt(1);
	            ArrayList<Attribut> listAttr = SELECT_ALL_ATTRIBUT_FOR_PAIR(id);
	            Attribut Attribut1 = SELECT_ATTRIBUT(listAttr.get(0).getId());
	            Attribut Attribut2 = SELECT_ATTRIBUT(listAttr.get(1).getId());
	            Attribut Attribut3 = SELECT_ATTRIBUT(listAttr.get(2).getId());
	            Attribut Attribut4 = SELECT_ATTRIBUT(listAttr.get(3).getId());
	            Attribut Attribut5 = SELECT_ATTRIBUT(listAttr.get(4).getId());	            
	            simP = new RandomPair(id, Attribut1, Attribut2, Attribut3, Attribut4, Attribut5);
	            for (Attribut attribut : listAttr) {
					val = val + attribut.getVal();
				}
	            val = (val / listAttr.size());
				simP.setVal(val);
	        }
			if(val < 0.4){
				simP = SELECT_RANDOM_PAIR();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return simP;
	}
	
	public static Pair SELECT_PAIR_BY_ID(int idPair){
		String sql = "SELECT * FROM pair WHERE ID = ?";
		Pair pair = null;
		PreparedStatement statement;
		try {
			statement = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sql);
			statement.setInt(1, idPair);
			ResultSet res  = statement.executeQuery();
			while (res.next()) {
				pair = new Pair();
				pair.setId(res.getInt(1));
				pair.setObj1(res.getString(2));
				pair.setObj2(res.getString(3));	            
	        }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pair;
	}
	
	public static RandomPair SELECT_PAIR_WITH_ATTRIBUT_BY_ID(int idPair){
		String sql = "SELECT * FROM pair WHERE ID = ?";
		RandomPair simP = null;
		PreparedStatement statement;
		try {
			statement = (PreparedStatement) DBConnectManager.getConnectionDB().prepareStatement(sql);
			statement.setInt(1, idPair);
			ResultSet res  = statement.executeQuery();
			
			while (res.next()) {
	            int id = res.getInt(1);
	            ArrayList<Attribut> listAttr = SELECT_ALL_ATTRIBUT_FOR_PAIR(id);
	            Attribut Attribut1 = SELECT_ATTRIBUT(listAttr.get(0).getId());
	            Attribut Attribut2 = SELECT_ATTRIBUT(listAttr.get(1).getId());
	            Attribut Attribut3 = SELECT_ATTRIBUT(listAttr.get(2).getId());
	            Attribut Attribut4 = SELECT_ATTRIBUT(listAttr.get(3).getId());
	            Attribut Attribut5 = SELECT_ATTRIBUT(listAttr.get(4).getId());

	            simP = new RandomPair(idPair, Attribut1, Attribut2, Attribut3, Attribut4, Attribut5);
	            
	        }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return simP;
	}
}
