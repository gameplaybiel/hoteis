package br.project.Hoteis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class HoteisDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    //Dao pra obter
    public Hoteis obter(int id) throws Exception {
        String sqlSelect = "select ID, HOSPEDE, HOTEL, NUMQUARTO, CIDADE, ESTADO from Hoteis where id = ?";
        try (Connection con = jdbcTemplate.getDataSource().getConnection();
             PreparedStatement ps = con.prepareStatement(sqlSelect);) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery();) {
                if (rs.next()) {
                    Hoteis h = new Hoteis();
                    h.setId(rs.getInt("id"));
                    h.setHospede(rs.getString("hospede"));
                    h.setHotel(rs.getString("hotel"));
                    h.setNumQuarto(rs.getString("numquarto"));
                    h.setCidade(rs.getString("cidade"));
                    h.setEstado(rs.getString("estado"));
                    return h;
                }
            }
            throw new Exception("Id não encontrado na tabela");
        }
    }

    //Dao pra listar
    public List<Hoteis> listar() throws Exception {
        String sqlSelect = "select ID, HOSPEDE, HOTEL, NUMQUARTO, CIDADO DE, ESTAfrom HOTEIS";
        try (Connection con = jdbcTemplate.getDataSource().getConnection();
             PreparedStatement ps = con.prepareStatement(sqlSelect);) {
            List<Hoteis> automoveis = new ArrayList<>();
            try (ResultSet rs = ps.executeQuery();) {
                while (rs.next()) {
                    Hoteis h = new Hoteis();
                    h.setId(rs.getInt("id"));
                    h.setHospede(rs.getString("hospede"));
                    h.setHotel(rs.getString("hotel"));
                    h.setNumQuarto(rs.getString("quarto"));
                    h.setCidade(rs.getString("cidade"));
                    h.setEstado(rs.getString("estado"));
                    automoveis.add(h);
                }
            }
            return automoveis;
        }
    }
    //Dao pra inserir
    public Hoteis incluir(Hoteis h) throws Exception {
        String sqlInsert = "INSERT INTO HOTEIS(ID, HOSPEDE, HOTEL, NUMQUARTO, CIDADE, ESTADO"
                + "VALUES (?, ?, ?, ?)";
        try (Connection con = jdbcTemplate.getDataSource().getConnection();
             PreparedStatement ps = con.prepareStatement(sqlInsert);) {
            ps.setInt(1, h.getId());
            ps.setString(2, h.getHospede());
            ps.setString(3, h.getHotel());
            ps.setString(4, h.getNumQuarto());
            ps.setString(5, h.getCidade());
            ps.setString(6, h.getEstado());
            int result = ps.executeUpdate();
            if (result == 1) {
                System.out.println("Hoteis inserido com sucesso.");
                return h;
            }
            ps.close();
            throw new Exception("Erro na inserção.");
        }
    }

}
