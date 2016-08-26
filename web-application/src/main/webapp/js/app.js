Vue.use(VueMaterial)

Vue.component('speaker', {
  props: ['speaker'],
  template: '<li>{{ speaker.name }}</li>'
})

var App = new Vue({
  el: '#app',
  data: {'speakers': [{'name': 'Waiting for API response...'}]},
  methods: {
    fetchSpeakers: function () {
      axios.get('/conference-speakers/resources/speakers')
        .then((response) => {
          console.log('Response: ' + response.data);
          this.speakers = response.data;
        })
        .catch((error) => console.log('Error: ' + error))
    }
  },
  mounted: function () { this.fetchSpeakers() }
})
