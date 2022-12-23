const TableFillVueApp = new Vue ({
  el: '#tableFill',
  data: {
      list: [],
      fields: [ 
          {id:'vagnum', name:'Номер вагона'}, 
          {id:'remtype', name:'Тип ремонта'}, 
          {id:'vag', name:'Тип вагона'}, 
          {id:'tsn', name:'Начало ремонта'}, 
          {id:'tsk', name:'Конец ремонта'},
          {id:'snazv', name:'Место ремонта'}],
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
      header:'Справочник ремонта вагонов',
  } 
 
})