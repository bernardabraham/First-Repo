(window.webpackJsonp=window.webpackJsonp||[]).push([[350],{1294:function(e,t,a){"use strict";a.r(t);var n,r=a(693),l=a(706),o=a(714),i=a(759),s=a(738),c=a(813),u=a(28),m=a(804),p=a(695),d=a(713),v=(n=function(e,t){return(n=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var a in t)t.hasOwnProperty(a)&&(e[a]=t[a])})(e,t)},function(e,t){function a(){this.constructor=e}n(e,t),e.prototype=null===t?Object.create(t):(a.prototype=t.prototype,new a)}),f=function(){return(f=Object.assign||function(e){for(var t,a=1,n=arguments.length;a<n;a++)for(var r in t=arguments[a])Object.prototype.hasOwnProperty.call(t,r)&&(e[r]=t[r]);return e}).apply(this,arguments)},h=function(e){function t(t){var a=e.call(this,t)||this;a.mounted=!1,a.getParams=function(e){var t=void 0===e?a.props:e,n=t.activation,r=t.rule,l={};if(r&&r.params){for(var o=0,i=r.params;o<i.length;o++){l[(u=i[o]).key]=u.defaultValue||""}if(n&&n.params)for(var s=0,c=n.params;s<c.length;s++){var u;l[(u=c[s]).key]=u.value}}return l},a.getQualityProfilesWithDepth=function(e){var t=(void 0===e?a.props:e).profiles;return Object(m.g)(t.filter(function(e){return!e.isBuiltIn&&e.actions&&e.actions.edit&&e.language===a.props.rule.lang})).map(function(e){return f({},e,{depth:e.depth-1})})},a.handleFormSubmit=function(e){e.preventDefault(),a.setState({submitting:!0});var t={key:a.state.profile,organization:a.props.organization,params:a.state.params,rule:a.props.rule.key,severity:a.state.severity};Object(s.a)(t).then(function(){return a.props.onDone(t.severity)}).then(function(){a.mounted&&(a.setState({submitting:!1}),a.props.onClose())},function(){a.mounted&&a.setState({submitting:!1})})},a.handleParameterChange=function(e){var t=e.currentTarget,n=t.name,r=t.value;a.setState(function(e){var t;return{params:f({},e.params,(t={},t[n]=r,t))}})},a.handleProfileChange=function(e){var t=e.value;a.setState({profile:t})},a.handleSeverityChange=function(e){var t=e.value;a.setState({severity:t})},a.renderSeverityOption=function(e){var t=e.value;return r.createElement(i.a,{severity:t})};var n=a.getQualityProfilesWithDepth(t);return a.state={params:a.getParams(t),profile:n.length>0?n[0].key:"",severity:t.activation?t.activation.severity:t.rule.severity,submitting:!1},a}return v(t,e),t.prototype.componentDidMount=function(){this.mounted=!0},t.prototype.componentWillUnmount=function(){this.mounted=!1},t.prototype.render=function(){var e=this,t=this.props,a=t.activation,n=t.rule,i=this.state,s=i.profile,m=i.severity,v=i.submitting,f=n.params,h=void 0===f?[]:f,y=this.getQualityProfilesWithDepth(),g=!!n.templateKey,b=y.length<=0,E=!!a;return r.createElement(l.a,{contentLabel:this.props.modalHeader,onRequestClose:this.props.onClose,size:"small"},r.createElement("form",{onSubmit:this.handleFormSubmit},r.createElement("div",{className:"modal-head"},r.createElement("h2",null,this.props.modalHeader)),r.createElement("div",{className:"modal-body"},!E&&b&&r.createElement(d.a,{variant:"info"},Object(u.l)("coding_rules.active_in_all_profiles")),r.createElement("div",{className:"modal-field"},r.createElement("label",null,Object(u.l)("coding_rules.quality_profile")),r.createElement(o.c,{className:"js-profile",clearable:!1,disabled:v||1===y.length,onChange:this.handleProfileChange,options:y.map(function(e){return{label:"   ".repeat(e.depth)+e.name,value:e.key}}),value:s})),r.createElement("div",{className:"modal-field"},r.createElement("label",null,Object(u.l)("severity")),r.createElement(o.c,{className:"js-severity",clearable:!1,disabled:v,onChange:this.handleSeverityChange,optionRenderer:this.renderSeverityOption,options:c.e.map(function(e){return{label:Object(u.l)("severity",e),value:e}}),searchable:!1,value:m,valueRenderer:this.renderSeverityOption})),g?r.createElement("div",{className:"modal-field"},r.createElement("p",{className:"note"},Object(u.l)("coding_rules.custom_rule.activation_notice"))):h.map(function(t){return r.createElement("div",{className:"modal-field",key:t.key},r.createElement("label",{title:t.key},t.key),"TEXT"===t.type?r.createElement("textarea",{disabled:v,name:t.key,onChange:e.handleParameterChange,placeholder:t.defaultValue,rows:3,value:e.state.params[t.key]||""}):r.createElement("input",{disabled:v,name:t.key,onChange:e.handleParameterChange,placeholder:t.defaultValue,type:"text",value:e.state.params[t.key]||""}),r.createElement("div",{className:"note",dangerouslySetInnerHTML:{__html:t.htmlDesc||""}}))})),r.createElement("footer",{className:"modal-foot"},v&&r.createElement("i",{className:"spinner spacer-right"}),r.createElement(p.i,{disabled:v||b},E?Object(u.l)("save"):Object(u.l)("coding_rules.activate")),r.createElement(p.h,{disabled:v,onClick:this.props.onClose},Object(u.l)("cancel")))))},t}(r.PureComponent);t.default=h},706:function(e,t,a){"use strict";a.d(t,"a",function(){return i});var n=a(693),r=a(735),l=a(694),o=function(){return(o=Object.assign||function(e){for(var t,a=1,n=arguments.length;a<n;a++)for(var r in t=arguments[a])Object.prototype.hasOwnProperty.call(t,r)&&(e[r]=t[r]);return e}).apply(this,arguments)};function i(e){return n.createElement(r,o({className:l("modal",{"modal-small":"small"===e.size,"modal-medium":"medium"===e.size,"modal-large":"large"===e.size}),isOpen:!0,overlayClassName:l("modal-overlay",{"modal-no-backdrop":e.noBackdrop})},e))}r.setAppElement("#content")},759:function(e,t,a){"use strict";a.d(t,"a",function(){return o});var n=a(693),r=a(859),l=a(28);function o(e){var t=e.className,a=e.severity;return a?n.createElement("span",{className:t},n.createElement(r.a,{className:"little-spacer-right",severity:a}),Object(l.l)("severity",a)):null}},828:function(e,t,a){var n;
/*!
  Copyright (c) 2015 Jed Watson.
  Based on code that is Copyright 2013-2015, Facebook, Inc.
  All rights reserved.
*/
/*!
  Copyright (c) 2015 Jed Watson.
  Based on code that is Copyright 2013-2015, Facebook, Inc.
  All rights reserved.
*/
!function(){"use strict";var r=!("undefined"==typeof window||!window.document||!window.document.createElement),l={canUseDOM:r,canUseWorkers:"undefined"!=typeof Worker,canUseEventListeners:r&&!(!window.addEventListener&&!window.attachEvent),canUseViewport:r&&!!window.screen};void 0===(n=function(){return l}.call(t,a,t,e))||(e.exports=n)}()}}]);
//# sourceMappingURL=350.1560762716920.chunk.js.map