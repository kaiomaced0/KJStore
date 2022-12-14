package br.unitins.kj.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import br.unitins.kj.model.Perfil;

@Converter(autoApply = true)
public class PeriflConverter implements AttributeConverter<Perfil, Integer>{

	@Override
	public Integer convertToDatabaseColumn(Perfil attribute) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Perfil convertToEntityAttribute(Integer dbData) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
