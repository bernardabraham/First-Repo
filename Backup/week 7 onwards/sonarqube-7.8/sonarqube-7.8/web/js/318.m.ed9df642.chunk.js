(window.webpackJsonp=window.webpackJsonp||[]).push([[318],{1686:function(e,t,n){"use strict";n.r(t);var a=n(363),r=n(369),s=n(380),o=n.n(s),i=n(717),c=n(429),l=n(0);function u(e){let t=e.severity;return a.createElement("div",{className:"nowrap"},Object(l.l)("quality_profiles.severity_set_to")," ",a.createElement(c.a,{severity:t}))}function p(e){let t=e.name,n=e.value;return a.createElement("div",{className:"quality-profile-changelog-parameter"},null==n?Object(l.m)("quality_profiles.changelog.parameter_reset_to_default_value",t):Object(l.m)("quality_profiles.parameter_set_to",t,n))}function h(e){let t=e.changes;return a.createElement("ul",null,Object.keys(t).map(e=>a.createElement("li",{key:e},"severity"===e?(e=>{const n=t[e];return n?a.createElement(u,{severity:n}):null})(e):a.createElement(p,{name:e,value:t[e]}))))}var m=n(404),f=n(370),d=n(13);function g(e){let t=!1;const n=o()(e.events,e=>-Number(Object(d.g)(e.date)),e=>e.action),s=n.map((s,o)=>{const c=o>0?n[o-1]:null,u=null!=c&&i(Object(d.g)(c.date),Object(d.g)(s.date)),p=null!=c&&u&&c.authorName===s.authorName&&c.action===s.action;p||(t=!t);const g="js-profile-changelog-event "+(t?"even":"odd");return a.createElement("tr",{className:g,key:o},a.createElement("td",{className:"thin nowrap"},!p&&a.createElement(m.a,{date:s.date})),a.createElement("td",{className:"thin nowrap"},!p&&(s.authorName?a.createElement("span",null,s.authorName):a.createElement("span",{className:"note"},"System"))),a.createElement("td",{className:"thin nowrap"},!p&&Object(l.l)("quality_profiles.changelog",s.action)),a.createElement("td",{className:"quality-profile-changelog-rule-cell"},a.createElement(r.Link,{to:Object(f.C)({rule_key:s.ruleKey},e.organization)},s.ruleName)),a.createElement("td",null,s.params&&a.createElement(h,{changes:s.params})))});return a.createElement("table",{className:"data zebra-hover"},a.createElement("thead",null,a.createElement("tr",null,a.createElement("th",{className:"thin nowrap"},Object(l.l)("date")),a.createElement("th",{className:"thin nowrap"},Object(l.l)("user")),a.createElement("th",{className:"thin nowrap"},Object(l.l)("action")),a.createElement("th",null,Object(l.l)("rule")),a.createElement("th",null,Object(l.l)("parameters")))),a.createElement("tbody",null,s))}var b=n(614),y=n(365);class v extends a.PureComponent{render(){return a.createElement("div",{className:"display-inline-block",id:"quality-profile-changelog-form"},a.createElement(b.a,{onChange:this.props.onDateRangeChange,value:this.props.dateRange}),a.createElement(y.a,{className:"spacer-left text-top",onClick:this.props.onReset},Object(l.l)("reset_verb")))}}function O(){return a.createElement("div",{className:"big-spacer-top"},Object(l.l)("no_results"))}var j=n(408),N=n(474);t.default=Object(r.withRouter)(class extends a.PureComponent{constructor(){super(...arguments),this.mounted=!1,this.state={loading:!0},this.handleDateRangeChange=(e=>{let t=e.from,n=e.to;const a=Object(N.a)(this.props.profile.name,this.props.profile.language,this.props.organization,{since:t&&Object(d.j)(t),to:n&&Object(d.j)(n)});this.props.router.push(a)}),this.handleReset=(()=>{const e=Object(N.a)(this.props.profile.name,this.props.profile.language,this.props.organization);this.props.router.push(e)})}componentDidMount(){this.mounted=!0,this.loadChangelog()}componentDidUpdate(e){e.location!==this.props.location&&this.loadChangelog()}componentWillUnmount(){this.mounted=!1}loadChangelog(){this.setState({loading:!0});const e=this.props.location.query,t={profileKey:this.props.profile.key};e.since&&(t.since=e.since),e.to&&(t.to=e.to),Object(j.p)(t).then(e=>{this.mounted&&this.setState({events:e.events,total:e.total,page:e.p,loading:!1})})}loadMore(e){if(e.preventDefault(),e.currentTarget.blur(),null!=this.state.page){this.setState({loading:!0});const e=this.props.location.query,t={profileKey:this.props.profile.key,p:this.state.page+1};e.since&&(t.since=e.since),e.to&&(t.to=e.to),Object(j.p)(t).then(e=>{this.mounted&&this.state.events&&this.setState({events:[...this.state.events,...e.events],total:e.total,page:e.p,loading:!1})})}}render(){const e=this.props.location.query,t=null!=this.state.events&&null!=this.state.total&&this.state.events.length<this.state.total;return a.createElement("div",{className:"boxed-group boxed-group-inner js-profile-changelog"},a.createElement("header",{className:"spacer-bottom"},a.createElement(v,{dateRange:{from:e.since?Object(d.g)(e.since):void 0,to:e.to?Object(d.g)(e.to):void 0},onDateRangeChange:this.handleDateRangeChange,onReset:this.handleReset}),this.state.loading&&a.createElement("i",{className:"spinner spacer-left"})),null!=this.state.events&&0===this.state.events.length&&a.createElement(O,null),null!=this.state.events&&this.state.events.length>0&&a.createElement(g,{events:this.state.events,organization:this.props.organization}),t&&a.createElement("footer",{className:"text-center spacer-top small"},a.createElement("a",{href:"#",onClick:this.loadMore.bind(this)},Object(l.l)("show_more"))))}})},404:function(e,t,n){"use strict";n.d(t,"b",function(){return o}),n.d(t,"a",function(){return i});var a=n(363),r=n(358),s=n(13);const o={year:"numeric",month:"long",day:"numeric",hour:"numeric",minute:"numeric"};function i(e){let t=e.children,n=e.date;return a.createElement(r.FormattedDate,Object.assign({value:Object(s.g)(n)},o),t)}},408:function(e,t,n){"use strict";n.d(t,"y",function(){return c}),n.d(t,"s",function(){return l}),n.d(t,"j",function(){return u}),n.d(t,"w",function(){return p}),n.d(t,"r",function(){return h}),n.d(t,"q",function(){return m}),n.d(t,"A",function(){return f}),n.d(t,"v",function(){return d}),n.d(t,"i",function(){return g}),n.d(t,"l",function(){return b}),n.d(t,"g",function(){return y}),n.d(t,"o",function(){return v}),n.d(t,"n",function(){return O}),n.d(t,"p",function(){return j}),n.d(t,"h",function(){return N}),n.d(t,"d",function(){return E}),n.d(t,"m",function(){return q}),n.d(t,"z",function(){return _}),n.d(t,"x",function(){return z}),n.d(t,"c",function(){return C}),n.d(t,"u",function(){return S}),n.d(t,"b",function(){return k}),n.d(t,"t",function(){return w}),n.d(t,"e",function(){return J}),n.d(t,"f",function(){return x}),n.d(t,"a",function(){return D}),n.d(t,"k",function(){return M});var a=n(411),r=n.n(a),s=n(489),o=n(4),i=n(382);function c(e){return Object(o.getJSON)("/api/qualityprofiles/search",e).catch(i.a)}function l(e){return Object(o.getJSON)("/api/qualityprofiles/show",e)}function u(e){return Object(o.request)("/api/qualityprofiles/create").setMethod("post").setData(e).submit().then(o.checkStatus).then(o.parseJSON).catch(i.a)}function p(e){return Object(o.request)("/api/qualityprofiles/restore").setMethod("post").setData(e).submit().then(o.checkStatus).then(o.parseJSON).catch(i.a)}function h(e){return Object(o.getJSON)("/api/qualityprofiles/projects",e).catch(i.a)}function m(e){return Object(o.getJSON)("/api/qualityprofiles/inheritance",{profileKey:e}).catch(i.a)}function f(e){return Object(o.post)("/api/qualityprofiles/set_default",{profileKey:e})}function d(e,t){return Object(o.post)("/api/qualityprofiles/rename",{key:e,name:t}).catch(i.a)}function g(e,t){return Object(o.postJSON)("/api/qualityprofiles/copy",{fromKey:e,toName:t}).catch(i.a)}function b(e){return Object(o.post)("/api/qualityprofiles/delete",{profileKey:e}).catch(i.a)}function y(e,t){return Object(o.post)("/api/qualityprofiles/change_parent",{profileKey:e,parentKey:t}).catch(i.a)}function v(){return Object(o.getJSON)("/api/qualityprofiles/importers").then(e=>e.importers,i.a)}function O(){return Object(o.getJSON)("/api/qualityprofiles/exporters").then(e=>e.exporters)}function j(e){return Object(o.getJSON)("/api/qualityprofiles/changelog",e)}function N(e,t){return Object(o.getJSON)("/api/qualityprofiles/compare",{leftKey:e,rightKey:t})}function E(e,t){return Object(o.post)("/api/qualityprofiles/add_project",{key:e,project:t}).catch(i.a)}function q(e,t){return Object(o.post)("/api/qualityprofiles/remove_project",{key:e,project:t}).catch(i.a)}function _(e){return Object(o.getJSON)("/api/qualityprofiles/search_users",e).catch(i.a)}function z(e){return Object(o.getJSON)("/api/qualityprofiles/search_groups",e).catch(i.a)}function C(e){return Object(o.post)("/api/qualityprofiles/add_user",e).catch(i.a)}function S(e){return Object(o.post)("/api/qualityprofiles/remove_user",e).catch(i.a)}function k(e){return Object(o.post)("/api/qualityprofiles/add_group",e).catch(i.a)}function w(e){return Object(o.post)("/api/qualityprofiles/remove_group",e).catch(i.a)}function J(e){return Object(o.postJSON)("/api/qualityprofiles/activate_rules",e)}function x(e){return Object(o.postJSON)("/api/qualityprofiles/deactivate_rules",e)}function D(e){const t=e.params&&r()(e.params,(e,t)=>"".concat(t,"=").concat(Object(s.a)(e))).join(";");return Object(o.post)("/api/qualityprofiles/activate_rule",Object.assign({},e,{params:t})).catch(i.a)}function M(e){return Object(o.post)("/api/qualityprofiles/deactivate_rule",e).catch(i.a)}},411:function(e,t,n){var a=n(50),r=n(15),s=n(470),o=n(6);e.exports=function(e,t){return(o(e)?a:s)(e,r(t,3))}},429:function(e,t,n){"use strict";n.d(t,"a",function(){return o});var a=n(363),r=n(529),s=n(0);function o(e){let t=e.className,n=e.severity;return n?a.createElement("span",{className:t},a.createElement(r.a,{className:"little-spacer-right",severity:n}),Object(s.l)("severity",n)):null}},489:function(e,t,n){"use strict";function a(e){const t=e.replace(/"/g,'\\"');return'"'.concat(t,'"')}n.d(t,"a",function(){return a})},529:function(e,t,n){"use strict";n.d(t,"a",function(){return i});var a=n(363),r=n(368),s=n(371);const o={blocker:function(e){let t=e.className,n=e.size;return a.createElement(r.a,{className:t,size:n},a.createElement("path",{d:"M8 14c-3.311 0-6-2.689-6-6s2.689-6 6-6 6 2.689 6 6-2.689 6-6 6zM7 9h2V4H7v5zm0 3h2v-2H7v2z",style:{fill:s.red,fillRule:"nonzero"}}))},critical:function(e){let t=e.className,n=e.size;return a.createElement(r.a,{className:t,size:n},a.createElement("path",{d:"M8 2c3.311 0 6 2.689 6 6s-2.689 6-6 6-6-2.689-6-6 2.689-6 6-6zm1 10V7.414l1.893 1.893c.13.124.282.216.457.261a1.006 1.006 0 0 0 1.176-.591 1.01 1.01 0 0 0 .01-.729 1.052 1.052 0 0 0-.229-.355c-1.212-1.212-2.394-2.456-3.638-3.636a1.073 1.073 0 0 0-.169-.123 1.05 1.05 0 0 0-.448-.133h-.104a1.053 1.053 0 0 0-.493.16 1.212 1.212 0 0 0-.162.132C6.08 5.505 4.836 6.687 3.656 7.932a.994.994 0 0 0-.051 1.275c.208.271.548.42.888.389.198-.019.378-.098.535-.218.041-.035.04-.034.079-.071L7 7.414V12h2z",style:{fill:s.red,fillRule:"nonzero"}}))},major:function(e){let t=e.className,n=e.size;return a.createElement(r.a,{className:t,size:n},a.createElement("path",{d:"M8 2c3.311 0 6 2.689 6 6s-2.689 6-6 6-6-2.689-6-6 2.689-6 6-6zm.08 2.903c.071.008.14.019.208.039.138.042.26.114.37.205 1.244 1.146 2.426 2.357 3.639 3.536.1.103.181.218.234.352a1.01 1.01 0 0 1 .001.728 1.002 1.002 0 0 1-1.169.609 1.042 1.042 0 0 1-.46-.255L8 7.295l-2.903 2.822c-.039.036-.039.036-.08.07a1.002 1.002 0 0 1-1.604-.947c.032-.196.122-.37.253-.519C4.847 7.51 6.09 6.362 7.303 5.183c.052-.048.106-.093.167-.131a1.041 1.041 0 0 1 .61-.149z",style:{fill:s.red}}))},minor:function(e){let t=e.className,n=e.size;return a.createElement(r.a,{className:t,size:n},a.createElement("path",{d:"M8 2c3.311 0 6 2.689 6 6s-2.689 6-6 6-6-2.689-6-6 2.689-6 6-6zm1 6.586V4H7v4.586L5.107 6.693a1.178 1.178 0 0 0-.165-.134 1.041 1.041 0 0 0-.662-.152 1 1 0 0 0-.587 1.7c1.212 1.212 2.394 2.456 3.638 3.636.094.08.195.146.311.191a1.008 1.008 0 0 0 1.065-.227c1.213-1.212 2.457-2.394 3.637-3.639a.994.994 0 0 0 .051-1.275 1.012 1.012 0 0 0-.888-.389 1.041 1.041 0 0 0-.535.218c-.04.034-.04.034-.079.071L9 8.586z",style:{fill:s.lightGreen}}))},info:function(e){let t=e.className,n=e.size;return a.createElement(r.a,{className:t,size:n},a.createElement("path",{d:"M8 2c3.311 0 6 2.689 6 6s-2.689 6-6 6-6-2.689-6-6 2.689-6 6-6zm1 5H7v5h2V7zm0-3H7v2h2V4z",style:{fill:s.blue}}))}};function i(e){if(!e.severity)return null;const t=e.severity.toLowerCase(),n=o[t];return n?a.createElement(n,{className:e.className}):null}},614:function(e,t,n){"use strict";n.d(t,"a",function(){return i});var a=n(363),r=n(364),s=n(623),o=n(0);class i extends a.PureComponent{constructor(){super(...arguments),this.handleFromChange=(e=>{this.props.onChange({from:e,to:this.to}),setTimeout(()=>{e&&!this.to&&this.toDateInput&&this.toDateInput.focus()},0)}),this.handleToChange=(e=>{this.setState({to:e}),this.props.onChange({from:this.from,to:e})})}get from(){return this.props.value&&this.props.value.from}get to(){return this.props.value&&this.props.value.to}render(){return a.createElement("div",{className:r("display-inline-flex-center",this.props.className)},a.createElement(s.a,{currentMonth:this.to,"data-test":"from",highlightTo:this.to,maxDate:this.to,onChange:this.handleFromChange,placeholder:Object(o.l)("start_date"),value:this.from}),a.createElement("span",{className:"note little-spacer-left little-spacer-right"},Object(o.l)("to_")),a.createElement(s.a,{currentMonth:this.from,"data-test":"to",highlightFrom:this.from,minDate:this.from,onChange:this.handleToChange,placeholder:Object(o.l)("end_date"),ref:e=>this.toDateInput=e,value:this.to}))}}},717:function(e,t,n){var a=n(718);e.exports=function(e,t){var n=a(e),r=a(t);return n.getTime()===r.getTime()}},718:function(e,t,n){var a=n(2);e.exports=function(e){var t=a(e);return t.setSeconds(0,0),t}}}]);
//# sourceMappingURL=318.m.ed9df642.chunk.js.map