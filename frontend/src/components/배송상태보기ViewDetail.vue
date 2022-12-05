<template>

    <v-card outlined>
        <v-card-title>
            배송상태보기 # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: '배송상태보기ViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/배송상태보기/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

