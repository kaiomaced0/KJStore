package br.unitins.kj.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import br.unitins.kj.model.BandeiraCartao;

@Converter(autoApply = true)
public class BandeiraCartaoConverter implements AttributeConverter<BandeiraCartao, Integer>{

	@Override
	public Integer convertToDatabaseColumn(BandeiraCartao attribute) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BandeiraCartao convertToEntityAttribute(Integer dbData) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
