<template>
  <div class = "container">
    <h2>Available Programs</h2>
    <table class = "table table-striped">
      <thead>
      <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Description</th>
      </tr>
      </thead>
      <tbody>
      <tr v-for="incentive in incentives" v-bind:key="incentive.id">
        <td> {{incentive.id }}</td>
        <td> {{incentive.incentiveName }}</td>
        <td> {{incentive.incentiveDescription}}</td>
      </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import IncentiveService from '../services/IncentiveService';
export default {
  name: 'Incentives',
  data(){
    return{
    }
  },
  methods:{
    getIncentives(){
      IncentiveService.getIncentives().then((response) =>{
        this.incentives = response.data;
      });
    }
  },
  created() {
    this.getIncentives();
  }
}

</script>

<style scoped>
.spacing{
margin-top: 4%;
margin-left: 5%;
margin-right: 5%;
}
</style>