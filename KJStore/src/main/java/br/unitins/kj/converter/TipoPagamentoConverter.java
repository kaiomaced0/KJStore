package br.unitins.kj.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import br.unitins.kj.model.TipoPagamento;

@Converter(autoApply = true)
public class TipoPagamentoConverter implements AttributeConverter<TipoPagamento, Integer> {

	@Override
	public Integer convertToDatabaseColumn(TipoPagamento tipo) {
		return tipo.getId();
	}

	@Override
	public TipoPagamento convertToEntityAttribute(Integer id) {
		return TipoPagamento.valueOf(id);
	}

}
