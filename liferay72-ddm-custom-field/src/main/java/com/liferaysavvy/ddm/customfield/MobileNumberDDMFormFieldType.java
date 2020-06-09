package com.liferaysavvy.ddm.customfield;

import com.liferay.dynamic.data.mapping.form.field.type.DDMFormFieldType;
import com.liferay.dynamic.data.mapping.form.field.type.DDMFormFieldTypeSettings;
import org.osgi.service.component.annotations.Component;

/**
 * This custom form field type tells Liferay to use the properties defined in FieldExtenderTypeSettings.class
 * for the custom DDM structure "ddm-users".
 */
@Component(
		immediate = true,
		property = {
				"ddm.form.field.type.name=ddm-mobile-number"
		},
		service = DDMFormFieldType.class
)
public class MobileNumberDDMFormFieldType implements DDMFormFieldType {

	public Class<? extends DDMFormFieldTypeSettings> getDDMFormFieldTypeSettings() {
		return CustomFieldDDMFormFieldTypeSettings.class;
	}

	public String getName() {
		//define name for custom field.
		return "ddm-mobile-number";
	}
}