//package com.desafio.itau.conversor;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.modelmapper.Conditions;
//import org.modelmapper.Converter;
//import org.modelmapper.ModelMapper;
//import org.modelmapper.PropertyMap;
//import org.modelmapper.convention.MatchingStrategies;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.desafio.itau.dominio.Apartamento;
//import com.desafio.itau.dominio.Condominio;
//import com.desafio.itau.dto.CondominioDTO;
//import com.desafio.itau.dto.ProprietarioDTO;
//
//@Configuration
//public class CondominioMapper {
////	
////	private Converter<Condominio, List<ProprietarioDTO>> converterProprietario = ctx  -> {
////		List<Apartamento> apartamentos = ctx.getSource().getApartamentos();
////		List<ProprietarioDTO> proprietarios = new ArrayList<>();
////		for (Apartamento apartamento : apartamentos) {
////			ProprietarioDTO prop = new ProprietarioDTO();
////			prop.setNome(apartamento.getProprietario().getNome());
////			proprietarios.add(prop);
////		}
////		return proprietarios;
////	};
////	
////	@Bean
////	public ModelMapper mapperCondominio() {
////		ModelMapper modelMapper = new ModelMapper();
////		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
////		PropertyMap<Condominio, CondominioDTO> condominioMap = new PropertyMap<Condominio, CondominioDTO>(){
////			protected void configure() {
////				when(Conditions.isNotNull()).map().setId(source.getId());
////				when(Conditions.isNotNull()).map().setEmail(source.getEmail());
////				when(Conditions.isNotNull()).map().setNome(source.getNome());
//////				map().setNumeroApartamentos(source.getNumeroDeApt()); 
////				when(Conditions.isNotNull()).map().setNumeroApartamentos(source.getNumeroDeApt());
////				when(Conditions.isNotNull()).map().setValorRateio(source.getValorRateio());
////				using(converterProprietario).map(source).setProprietario(null);
////			}
////		};
////		modelMapper.addMappings(condominioMap);
////		return modelMapper;
////	}
//	
//	@Bean
//	public ModelMapper modelMapper() {
//		return new ModelMapper();
//	}
//	
//}
