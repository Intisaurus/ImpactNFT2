<script>
import Sidebar from '@/components/Sidebar.vue'
import EnterProgramForm from '@/components/EnterProgramForm.vue'
  export default {
  name:'Create',
  components: {Sidebar, EnterProgramForm},
    data() {
      return {}
    }
  }
</script>

<template>
  <router-view/>
  <div class="row">
  <div class="col-1">
    <Sidebar />
    </div>
    <div class ="spacing col-6">
    <EnterProgramForm />
    </div>
  </div>
</template>

<style>
.spacing{
margin-top: 4%;
margin-left: 5%;
margin-right: 5%;
}
</style>
