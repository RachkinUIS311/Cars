const TableFillVueApp = new Vue ({
  el: '#tableFill',
  data: {
      list: [],
      fields: [ 
          {id:'brand', name:'Бренд'},
          {id:'model', name:'модель'},
          {id:'seller', name:'продавец'},
          {id:'price', name:'цена'}],
      a: 1
  },
  methods: {
    getList() {
        axios
            .get("http://localhost:8080/server/vu36/getlist")
            .then((value) => {
        this.list = value.data.list;});  
    }
  },
  mounted() {
      this.getList()
  }
})


const PageVueApp = new Vue ({
  el: '#head',
  data: {
      header:'Автосалон',
  } 
 
})