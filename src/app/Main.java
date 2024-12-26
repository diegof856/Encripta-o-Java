package app;



import java.io.*;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o caminho do arquivo: ");
        String strPath = sc.nextLine();
        String key = "testeransomwares";
        File path = new File(strPath);
        List<String> lines = new ArrayList<>();

        if(path.getName().endsWith("ransomwaretroll.txt")){
            try (BufferedReader br = new BufferedReader(new FileReader(path))){
                String line = br.readLine();
                while (line != null){
                    lines.add(line);
                    line = br.readLine();
                }

            }catch (IOException e){
                System.out.println("Error: "+ e.getMessage());
            }
            if(path.exists()){
                path.delete();
            }
            File file = new File(path.getParentFile(), "teste.txt");
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
                for(String l:lines){
                    bw.write(new Decrypt().decryptAES(l,key));
                    bw.newLine();
                }
            }catch (IOException e){
                System.out.println("Error: "+ e.getMessage());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }else{
            try (BufferedReader br = new BufferedReader(new FileReader(path))){
                String line = br.readLine();
                while (line != null){
                    lines.add(line);
                    line = br.readLine();
                }

            }catch (IOException e){
                System.out.println("Error: "+ e.getMessage());
            }
            if(path.exists()){
                path.delete();
            }
            File file = new File(path.getParentFile(), "teste.ransomwaretroll.txt");
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
                for(String l:lines){
                    bw.write(new Encrypt().encryptAES(l,key));
                    bw.newLine();
                }
            }catch (IOException e){
                System.out.println("Error: "+ e.getMessage());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }



    }

}