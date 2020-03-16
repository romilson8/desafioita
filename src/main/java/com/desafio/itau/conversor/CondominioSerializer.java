package com.desafio.itau.conversor;

import java.io.IOException;

import com.desafio.itau.dto.CondominioDTO;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class CondominioSerializer extends StdSerializer<CondominioDTO> {
	private static final long serialVersionUID = 1L;

	public CondominioSerializer() {
        this(null);
    }
   
    public CondominioSerializer(Class<CondominioDTO> t) {
        super(t);
    }
 
    @Override
    public void serialize(
    		CondominioDTO value, JsonGenerator jgen, SerializerProvider provider) 
      throws IOException, JsonProcessingException {
  
        jgen.writeStartObject();
        jgen.writeStringField("nome", value.getNome());
        jgen.writeArrayFieldStart("despesas");
        value.getDespesas().forEach( desp -> {
        	try {
				jgen.writeObject(desp);
        	} catch (IOException e) {
        		e.printStackTrace();
        	}
        });
        jgen.writeEndArray();
        jgen.writeArrayFieldStart("proprietarios");
        value.getApartamentos().forEach(prop -> {
        	try {
				jgen.writeStartObject();
				jgen.writeStringField("numeroApt", prop.getNumero());
				jgen.writeStringField("nome", prop.getProprietario().getNome());
				jgen.writeStringField("email", prop.getProprietario().getEmail());
				jgen.writeEndObject();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        });
        jgen.writeEndArray();
        jgen.writeEndObject();
    }

}