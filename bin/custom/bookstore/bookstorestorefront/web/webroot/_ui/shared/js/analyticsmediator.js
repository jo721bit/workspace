/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE or an SAP affiliate company.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
var mediator = (function() {
	var subscribe = function(tracker, fn) {
			if (!mediator.trackers[tracker])
			{
				mediator.trackers[tracker] = [];
			}
			mediator.trackers[tracker].push({context: this, callback: fn});
			return this;
		},

		publish = function(tracker) {
			if (!mediator.trackers[tracker])
			{
				return false;
			}
			var args = Array.prototype.slice.call(arguments, 1);
			for (var i = 0, l = mediator.trackers[tracker].length; i < l; i++)
			{
				var subscription = mediator.trackers[tracker][i];
				subscription.callback.apply(subscription.context, args);
			}
			return this;
		},

		publishAll = function() {
			if (Object.keys(mediator.trackers).length === 0)
			{
				return false;
			}
			for (var tracker in mediator.trackers)
			{
				var args = [tracker].concat(Array.prototype.slice.call(arguments));
				mediator.publish.apply(this, args);
			}
			return this;
		};

	return {
		trackers: {},
		publish: publish,
		publishAll: publishAll,
		subscribe: subscribe
	}
})()