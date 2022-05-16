public class Owner {
 private String Nome;
 private String CPF;
 private String RG;
 private String Data_de_Nascimento;
 private String RUA;
 private String Bairro;
 private String Cidade;
 private String Estado;
 private String Cep;
 private String Complemento;

public Owner(String Nome, String CPF, String RG){
 this.Nome=Nome;
 this.CPF=CPF;
 this.RG=RG;
}


 public String getNome() {
  return Nome;
 }

 public void setNome(String nome) {
  Nome = nome;
 }

 public String getCPF() {
  return CPF;
 }

 public void setCPF(String CPF) {
  this.CPF = CPF;
 }

 public String getRG() {
  return RG;
 }

 public void setRG(String RG) {
  this.RG = RG;
 }

 public String getData_de_Nascimento() {
  return Data_de_Nascimento;
 }

 public void setData_de_Nascimento(String data_de_Nascimento) {
  Data_de_Nascimento = data_de_Nascimento;
 }

 public String getRUA() {
  return RUA;
 }

 public void setRUA(String RUA) {
  this.RUA = RUA;
 }

 public String getBairro() {
  return Bairro;
 }

 public void setBairro(String bairro) {
  Bairro = bairro;
 }

 public String getCidade() {
  return Cidade;
 }

 public void setCidade(String cidade) {
  Cidade = cidade;
 }

 public String getEstado() {
  return Estado;
 }

 public void setEstado(String estado) {
  Estado = estado;
 }

 public String getCep() {
  return Cep;
 }

 public void setCep(String cep) {
  Cep = cep;
 }

 public String getComplemento() {
  return Complemento;
 }

 public void setComplemento(String complemento) {
  Complemento = complemento;
 }
}

