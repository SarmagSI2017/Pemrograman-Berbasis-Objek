class ekspresiwajah{
    private String message = "Perhatikan ekspresi wajah saya!";
    public String respons(){
        return this.message;
    }
}

class Gembira extends ekspresiwajah{
    private String message = "ha ha ha..";
    public String respons(){
        return this.message;
    }
}

class Sedih extends ekspresiwajah{
    private String message = "hik hik ngeee ngeee ngeee..";
    public String respons(){
        return this.message;
    }
}

class Marah extends ekspresiwajah{
    private String message = "Hai kurang ajar..!";
    public String respons(){
        return this.message;
    }
}