package com.liferaysavvy.ddm.customfield;

import com.liferay.dynamic.data.mapping.render.BaseDDMFormFieldValueRenderer;
import com.liferay.dynamic.data.mapping.render.DDMFormFieldValueRenderer;
import com.liferay.dynamic.data.mapping.render.ValueAccessor;
import com.liferay.dynamic.data.mapping.storage.DDMFormFieldValue;
import org.osgi.service.component.annotations.Component;

import java.util.Locale;

/**
 * This class tells Liferay how to render the user inside the overview list.
 * In this case, the value (a screen name) is converted to the users's full name.
 * If that fails or if the screen name is null or empty,
 */
@Component(immediate = true, service = DDMFormFieldValueRenderer.class)
public class MobileNumberDDMFormFieldValueRenderer extends BaseDDMFormFieldValueRenderer {

	protected ValueAccessor getValueAcessor(Locale locale) {
		return new ValueAccessor(locale) {
			public String get(DDMFormFieldValue ddmFormFieldValue) {
				return ddmFormFieldValue.getValue().getString(locale);
			}
		};
	}

	public String getSupportedDDMFormFieldType() {
		//define custom field type and structure field ftl file should be moble-number.ftl name.
		return "ddm-mobile-number";
	}
}