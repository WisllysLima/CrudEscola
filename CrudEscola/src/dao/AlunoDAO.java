package dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import model.Aluno;

public class AlunoDAO {

    Connection conexao;
    PreparedStatement pstm;

    public AlunoDAO() {
        conexao = new ConnectionFactory().getConexao();
    }

    public void listarAlunos() {
        String sql = "SELECT * FROM aluno WHERE nome = ' '";

        try {
            pstm = (PreparedStatement) conexao.prepareStatement(sql);

        } catch (Exception e) {
        }
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
