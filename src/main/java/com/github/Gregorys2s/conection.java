package com.github.Gregorys2s;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conection {
    public static Connection conectar()
    {
        String url = "jdbc:postgresql://localhost:5432/systemsos";
        String usuario = "postgres";
        String senha = "admin";

        try {
            Connection conectado = DriverManager.getConnection(url,usuario,senha);
            System.out.println("Conectado com sucesso!");
            return conectado;
        }catch(SQLException e)
        {
            System.out.println("Erro ao conectar");
            e.printStackTrace();
            return null;
        }
    }

}
