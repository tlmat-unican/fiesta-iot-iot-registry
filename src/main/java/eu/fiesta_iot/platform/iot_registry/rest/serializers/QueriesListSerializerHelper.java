/*******************************************************************************
 * Copyright (c) 2018 Jorge Lanza, 
 *                    David Gomez, 
 *                    Luis Sanchez,
 *                    Juan Ramon Santana
 *
 * For the full copyright and license information, please view the LICENSE
 * file that is distributed with this source code.
 *******************************************************************************/
package eu.fiesta_iot.platform.iot_registry.rest.serializers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement(name = "queries")
public class QueriesListSerializerHelper implements ListSerializerHelper<Long> {
	@XmlElement(name = "query")
	@JsonProperty(value = "queries")
	public List<Long> list;

	public QueriesListSerializerHelper() {
		list = new ArrayList<Long>();
	}

	public QueriesListSerializerHelper(List<Long> list) {
		this.list = Collections.unmodifiableList(list);;
	}

	public ListSerializerHelper<Long> getInstance(List<Long> list) {
		return new QueriesListSerializerHelper(list);
	}

}
