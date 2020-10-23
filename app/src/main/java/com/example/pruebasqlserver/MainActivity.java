package com.example.pruebasqlserver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainActivity extends AppCompatActivity {

    EditText  email,pass;
    Button consultar;
    TextView nombre, telefono, direccion;

    /*
        String BaseDeDatos="clubNatacion";
    String ServidorRemoto="jdbc:jtds:sqlserver://IP_PUBLICA:1433/"+BaseDeDatos;//para usar atravez de internet
    String ServidorLocal="jdbc:jtds:sqlserver://DESKTOP-S8OKML6\\SQLEXPRESS:1433/"+BaseDeDatos;//para usar en intranet para mejorar el rendimiento
    String Servidor="";
    String  Usuario="sa";
    String Clave="1234";
    String Datos;
    Connection Conexion;

    public class EjecutaSelect extends AsyncTask<Void, Integer, ResultSet> {
    public String Consulta="";

    public ResultSet Obj_Result = null;
    public EjecutaSelect(String sql)    {
        Consulta=sql;
        BaseDeDatos="clubNatacion";

        if(VOnline.equals("true")){
            Servidor=ServidorRemoto;
        }
        else{
            Servidor=ServidorLocal;
        }
        Usuario="sa";
        Clave="1234";
        //  Object rs[] = new Object[2];
    }

    @Override
    protected ResultSet doInBackground(Void... params) {

        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Servidor, Usuario, Clave);
            Statement st = conn.createStatement();
            //solo para select retorna el array
            Obj_Result= st.executeQuery(Consulta);


        } catch (SQLException se) {
            System.out.println("oops! No se puede conectar. Error: " + se.toString());
        } catch (ClassNotFoundException e) {
            System.out.println("oops! No se encuentra la clase. Error: " + e.getMessage());
        }
        return Obj_Result;
    }
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=(EditText)findViewById(R.id.etEmail);
        pass=(EditText)findViewById(R.id.etPass);
        nombre=(TextView)findViewById(R.id.textNombre);
        telefono=(TextView)findViewById(R.id.textTelefono);
        direccion=(TextView)findViewById(R.id.textDireccion);
        consultar=(Button)findViewById(R.id.btnAcceso);
    }

    public void acceder(View view) {
        consultarCliente();
    }

    public Connection conexionBD() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Connection con= null;
        try{

            StrictMode.ThreadPolicy politica= new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(politica);
            Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();
            con= DriverManager.getConnection("jdbc:jtds:sqlserver:/192.168.0.51; integratedSecurity=true; databaseName=clubNatacion; user=sa;password=1234;");

        }catch(Exception e){
            Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();
        }

        return con;
    }

    private void consultarCliente() {
        try{
            Statement stm= conexionBD().createStatement();
            ResultSet rs= stm.executeQuery("SELECT * FROM clientes WHERE emailCliente='"+email.getText().toString()+"' AND passCliente='"+pass.getText().toString());
            if(rs.next()){
                nombre.setText(rs.getString(2));
                telefono.setText(rs.getString(6));
                direccion.setText(rs.getString(4));
            }
            email.setText("");
        }catch(Exception e){

        }
    }
}