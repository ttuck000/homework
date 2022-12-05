<template>

    <v-data-table
        :headers="headers"
        :items="배송상태보기"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: '배송상태보기View',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            배송상태보기 : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/배송상태보기'))

            temp.data._embedded.배송상태보기.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.배송상태보기 = temp.data._embedded.배송상태보기;
        },
        methods: {
        }
    }
</script>

