package CrudEscola;

import dao.ConnectionFactory;
import view.JFrameAluno;

public class Main {

    public static void main(String[] args) {
        ConnectionFactory cn = new ConnectionFactory();
        cn.getConexao();

        JFrameAluno frame = new JFrameAluno();
        frame.setVisible(true);
    }
}
