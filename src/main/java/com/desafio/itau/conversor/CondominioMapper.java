package com.desafio.itau.conversor;

import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.desafio.itau.dominio.Condominio;
import com.desafio.itau.dto.CondominioDTO;

@Configuration
public class CondominioMapper {
	
	@Bean
	public ModelMapper mapperCondominio() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		PropertyMap<Condominio, CondominioDTO> condominioMap = new PropertyMap<Condominio, CondominioDTO>(){
			protected void configure() {
				when(Conditions.isNotNull()).map().setId(source.getId());
				when(Conditions.isNotNull()).map().setEmail(source.getEmail());
				when(Conditions.isNotNull()).map().setNome(source.getNome());
				when(Conditions.isNotNull()).map().setNumeroApartamentos(source.getNumeroDeApt());
				when(Conditions.isNotNull()).map().setValorRateio(source.getValorRateio());
			}
		};
		modelMapper.addMappings(condominioMap);
		return modelMapper;
	}
	
}
