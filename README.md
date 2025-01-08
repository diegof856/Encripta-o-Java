# Projeto de Criptografia AES com Arquivos

Este projeto foi desenvolvido em **Java** e permite a criptografia e descriptografia de arquivos utilizando o algoritmo **AES**. O programa pode ler arquivos de texto, aplicar criptografia ou descriptografias, e salvar o resultado em um novo arquivo.

## Pré-Requisitos

- **Java 8** ou superior.
  - Este projeto utiliza classes como `Cipher` e `SecretKeySpec` para criptografia, que estão disponíveis nas versões 8 e superiores do Java.
  - Certifique-se de ter o Java instalado em seu sistema.

## Como Executar o Projeto

### 1. Instalar o Java

Se você não tiver o Java instalado, siga as instruções abaixo:

- **Windows/Mac/Linux**: Baixe e instale o [JDK do Java](https://www.oracle.com/java/technologies/javase-jdk15-downloads.html) (qualquer versão superior à 8).

Após a instalação, verifique se o Java foi instalado corretamente no terminal ou prompt de comando:

```bash
java -version
```
### 2. Compilar o Código

Se você não estiver utilizando uma IDE (como Eclipse, IntelliJ ou NetBeans), pode compilar e executar o código diretamente pela linha de comando. Siga os passos:

- De um git clone neste repositorio ou baixe diretamente.
```bash
git clone https://github.com/diegof856/Encriptacao-Java.git
```
- No terminal, navegue até o diretório do projeto e compile o código com o seguinte comando:
```bash
javac Main.java Encrypt.java Decrypt.java
```
### 3. Executar o Programa
Para rodar o programa, use o seguinte comando:
```bash
java Main
```
O programa pedirá para você informar o caminho do arquivo. Dependendo do nome do arquivo, ele realizará a criptografia ou descriptografias e gerará um novo arquivo com a extensão modificada:

- Se o arquivo tiver o nome ransomwaretroll.txt, ele será descriptografado e salvo como teste.txt.
- Caso contrário, o arquivo será criptografado e salvo como teste.ransomwaretroll.txt.
### 4. Entrada e Saída
- Entrada: O programa solicitará o caminho do arquivo de texto que você deseja criptografar ou descriptografar.
- Saída: O programa gerará um novo arquivo no mesmo diretório do arquivo original, com o conteúdo criptografado ou descriptografado.
### 5. Exemplo de Execução
- Se o arquivo original for ransomwaretroll.txt, a saída será um arquivo chamado teste.txt com o conteúdo descriptografado.
- Caso o arquivo tenha outro nome, ele será criptografado e salvo com a extensão .ransomwaretroll.txt.
#### Agora as instruções estão completas e prontas para serem usadas.
