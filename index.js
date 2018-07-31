"use strict"

import PropTypes from 'prop-types';
import { requireNativeComponent, View } from 'react-native';

module.exports = requireNativeComponent('RNTBgImage', {
	name: 'RNTBgImage',
	propTypes: {
		drawable: PropTypes.string,
		...View.propTypes // include the default view properties
	}
});
