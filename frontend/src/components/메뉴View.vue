<template>

    <v-data-table
        :headers="headers"
        :items="메뉴"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: '메뉴View',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            메뉴 : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/메뉴'))

            temp.data._embedded.메뉴.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.메뉴 = temp.data._embedded.메뉴;
        },
        methods: {
        }
    }
</script>

