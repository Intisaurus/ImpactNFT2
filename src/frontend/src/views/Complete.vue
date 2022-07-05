<script>
import Sidebar from '@/components/Sidebar.vue'
import CompleteProgramForm from '@/components/CompleteProgramForm.vue'
export default{
name:'Complete',
components:{Sidebar, CompleteProgramForm},
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
        <CompleteProgramForm />
    </div>
    </div>
</template>

<style scoped>
.spacing{
margin-top: 4%;
margin-left: 5%;
margin-right: 5%;
}
</style>