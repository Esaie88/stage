;(function() {
	var base = MODULE_PATH + '/js/';

	AUI().applyConfig(
		{
			groups: {
				liferaysavvymodulesoverride: {
					base: base,
					combine: Liferay.AUI.getCombine(),
					filter: Liferay.AUI.getFilterConfig(),
					modules: {
						'liferay-portlet-dynamic-data-mapping-override': {
							path: 'main_override.js',
							condition: {
								name: 'liferay-portlet-dynamic-data-mapping-override',
								trigger: 'liferay-portlet-dynamic-data-mapping',
								when: 'instead'
							}
						},
						'liferay-portlet-dynamic-data-mapping-custom-fields-override': {
							path: 'custom_fields_override.js',
							condition: {
								name: 'liferay-portlet-dynamic-data-mapping-custom-fields-override',
								trigger: 'liferay-portlet-dynamic-data-mapping-custom-fields'
							}
						}
					},
					root: base
				}
			}
		}
	);
})();