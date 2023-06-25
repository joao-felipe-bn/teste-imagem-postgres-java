package com.example.streams;

import com.example.streams.exercicios.FuncionarioExerciciosController;
import com.example.streams.lista_impares.ListaImparesController;
import com.example.streams.oficialdocumentation.DocumentationOracleController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		if(true){
			ListaImparesController.retornarListaImpar();
			DocumentationOracleController.filterExample();
			DocumentationOracleController.mapExample();
		}

		if(true){

			FuncionarioExerciciosController.getNameAllBrazilians();
			FuncionarioExerciciosController.salaryAllAgentinos();
			FuncionarioExerciciosController.sumAllSalary();
			FuncionarioExerciciosController.sumAllAges();
			FuncionarioExerciciosController.allFuncionariosLess10000();
			FuncionarioExerciciosController.salaryLutador();
			FuncionarioExerciciosController.allPcd();

		}

	}

}
