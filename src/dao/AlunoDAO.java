package dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import model.Aluno;

public class AlunoDAO {

    Connection conexao;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Aluno> lista = new ArrayList();

    public AlunoDAO() {
        conexao = new ConnectionFactory().getConexao();
    }

    public ArrayList<Aluno> listarAlunos(String sql) {
        //String sql = "SELECT * FROM aluno";

        try {
            pstm = (PreparedStatement) conexao.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Aluno aluno = new Aluno();

                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setTelefone(rs.getString("telefone"));

                lista.add(aluno);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Listar Alunos" + e);
        }
        return lista;
    }

    public void createAluno(Aluno aluno) {
        String sql = "INSERT INTO aluno(nome, telefone) values(?,?)";

        try {
            pstm = (PreparedStatement) conexao.prepareStatement(sql);

            pstm.setString(1, aluno.getNome());
            pstm.setString(2, aluno.getTelefone());

            pstm.execute();
            pstm.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cadastrar Aluno:" + e);
        }
        JOptionPane.showMessageDialog(null, "Aluno Cadastrado");
    }

    public void updateAluno(Aluno aluno) {

    }

    public void deleteAluno(Aluno aluno) {

    }
}
