package com.example.streams.exercicios;

import com.example.streams.utils.DateUtils;
import com.example.streams.utils.Nacionalidade;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioExerciciosController {
    private static List<Funcionario> funcionaios = loadFuncionarios();

   //1 - map - nome todos os brasileiros
    public static void getNameAllBrazilians(){
        funcionaios.stream()
                .filter(funcionario -> Nacionalidade.BRASILEIRA.name().equals(funcionario.getNacionalidade()))
                .map(funcionario -> funcionario.getNome())
                .forEach(System.out::println);
    }

    //2 - map - salario de todos os argentinos
    public static void salaryAllAgentinos(){
        funcionaios.stream()
                .filter(funcionario -> Nacionalidade.ARGENTINA.name().equals(funcionario.getNacionalidade()))
                .map(funcionario -> funcionario.getSalario())
                .forEach(System.out::println);
    }

    //3 - reduce - soma de todos os salarios
    public static void sumAllSalary(){
        Double allSalary = funcionaios
                .stream()
                .reduce(0.0, (total,funcionario) -> total+funcionario.getSalario(),Double::sum);

        System.out.println(String.format("sumAllSalary %s",allSalary));
    }

    //4 - reduce - soma de todas as idades
    public static void sumAllAges(){

        Integer somaAges = funcionaios
                .stream()
                .reduce(0, (total,funcionario) -> total+DateUtils.getIdade(funcionario.getDataNascimento()), Integer::sum);

        System.out.println(String.format("somaAges %s",somaAges));
    }

    //5 - todos os funcionarios que ganham menos que 10.000
    public static void allFuncionariosLess10000(){
        funcionaios.stream()
                .filter(funcionario -> funcionario.getSalario() < 10000.00)
                .forEach(funcionario -> System.out.println(funcionario.getNome() +" " + funcionario.getSalario()));
    }

    //6 - Salario dos lutadores
    public static void salaryLutador(){
        Double salary = funcionaios.stream()
                .filter(funcionario -> "Lutador".equals(funcionario.getCargo()))
                .mapToDouble(funcionario -> funcionario.getSalario()).sum();
        System.out.println(String.format("salaryLutador %s",salary));
    }

    //7 - todas os pcd
    public static void allPcd(){
        funcionaios.stream()
                .filter(funcionario -> funcionario.isPcd())
                .forEach(funcionario -> System.out.println(String.format("%s",funcionario.getNome())));
    }

    private static List<Funcionario> loadFuncionarios(){
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("João Felipe", DateUtils.convertStringToDate("03/05/1994"), 10060.00,"Analisa3", Nacionalidade.BRASILEIRA.name(),false,DateUtils.convertStringToDate("06/02/2021"),"46698956235","Casado"));
        funcionarios.add(new Funcionario("Guilherme", DateUtils.convertStringToDate("03/05/1996"), 10500.00,"Analista3", Nacionalidade.BRASILEIRA.name(),false,DateUtils.convertStringToDate("03/02/2022"),"46698956235","Solteiro"));
        funcionarios.add(new Funcionario("Edson Roberto Mazurek", DateUtils.convertStringToDate("03/05/1985"), 15300.00,"Especialista", Nacionalidade.BRASILEIRA.name(),false,DateUtils.convertStringToDate("03/12/2021"),"46698956235","Casado" ));
        funcionarios.add(new Funcionario("Robson", DateUtils.convertStringToDate("03/05/1986"), 22000.00,"Gerente",Nacionalidade.BRASILEIRA.name(), false,DateUtils.convertStringToDate("03/02/2019"),"46698956554","Casado" ));
        funcionarios.add(new Funcionario("JonJones", DateUtils.convertStringToDate("03/05/1987"), 1200000.00,"Lutador",Nacionalidade.AMERICANA.name(), false,DateUtils.convertStringToDate("03/02/2011"),"46698956235","Solteiro" ));
        funcionarios.add(new Funcionario("João Felipe", DateUtils.convertStringToDate("03/05/1994"), 10060.00,"Analisa3", Nacionalidade.BRASILEIRA.name(),true,DateUtils.convertStringToDate("06/02/2021"),"46698956235","Casado"));
        funcionarios.add(new Funcionario("Guilherme", DateUtils.convertStringToDate("03/05/1996"), 10500.00,"Analista3", Nacionalidade.ARGENTINA.name(), false,DateUtils.convertStringToDate("03/02/2022"),"46698956235","Solteiro"));
        funcionarios.add(new Funcionario("Edson Roberto Mazurek", DateUtils.convertStringToDate("03/05/1985"), 15300.00,"Especialista", Nacionalidade.BRASILEIRA.name(),false,DateUtils.convertStringToDate("03/12/2021"),"46698956235","Casado" ));
        funcionarios.add(new Funcionario("Robson", DateUtils.convertStringToDate("03/05/1986"), 22000.00,"Gerente", Nacionalidade.ARGENTINA.name(), true,DateUtils.convertStringToDate("03/02/2019"),"46698956554","Casado" ));
        funcionarios.add(new Funcionario("JonJones", DateUtils.convertStringToDate("03/05/1987"), 1200000.00,"Lutador",Nacionalidade.AMERICANA.name(), false,DateUtils.convertStringToDate("03/02/2011"),"46698956235","Solteiro" ));
        funcionarios.add(new Funcionario("Robson", DateUtils.convertStringToDate("03/05/1986"), 8000.00,"Gerente", Nacionalidade.BRASILEIRA.name(), true,DateUtils.convertStringToDate("03/02/2019"),"46698956554","Solteiro" ));
        return funcionarios;
    }


}
