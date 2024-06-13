/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcular;


import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import modelo.Moneda;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.ParseException;

/**
 *
 * @author Gutierrez Medina Anthony Kent  <U18100033@utp.edu.pe>
 */
public class buscarMoneda {
    public Moneda buscar(String abreviatura) {
        Moneda moneda = null;
        try {
            // Establecer URL
            String urlStr = "https://v6.exchangerate-api.com/v6/71208ea57106c81b185f1348/latest/USD";

            // Realizar la solicitud
            URL url = new URL(urlStr);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            // Convertir a JSON
            JsonElement root = JsonParser.parseReader(new InputStreamReader(request.getInputStream()));
            JsonObject jsonObject = root.getAsJsonObject();

            // Obtener el JSON interno con la clave "conversion_rates"
            JsonObject jsonInterno = jsonObject.getAsJsonObject("conversion_rates");

            for (String clave : jsonInterno.keySet()) {
                if (clave.equals(abreviatura)) {
                    JsonElement valor = jsonInterno.get(clave);
                    double doubleValor = valor.getAsDouble();
                    moneda = new Moneda(clave, doubleValor);
                    break;  // Salir del bucle una vez encontrada la moneda
                }
            }

        } catch (Exception e) {
            System.out.println("Ha surgido un error: " + e.getMessage());
        }
        return moneda;
    }
}