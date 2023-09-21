package br.project.Hoteis;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Hoteis {

    private int id;
    private String hospede;
    private String hotel;
    private String numQuarto;
    private String cidade;
    private String estado;

    public Hoteis(){

    }
    public int getId() {
        return id;
    }

    public String getHospede() {
        return hospede;
    }

    public String getHotel() {
        return hotel;
    }

    public String getNumQuarto() {
        return numQuarto;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHospede(String hospede) {
        this.hospede = hospede;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public void setNumQuarto(String numQuarto) {
        this.numQuarto = numQuarto;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
