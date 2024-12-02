package models;

public enum EnumCurso {

    ADMINISTRACAO("Administração"),
    ENGENHARIA("Engenharia"),
    DIREITO("Direito"),
    MEDICINA("Medicina"),
    COMPUTACAO("Ciência da Computação");

    private String valor;

    private EnumCurso(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
