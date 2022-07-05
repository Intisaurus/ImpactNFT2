<template>
<router-view/>
  <div class="container">
     <div class="col-md-8 offset-md-2 rounded px-5 py-4 shadow bg-white text-center mt-5">
          <LoginForm />
          </div>
  </div>
</template>

<script>
import LoginForm from '@/components/LoginForm.vue'
  export default {
  name:'LoginView',
  components: {
  LoginForm
  },
    data() {
      return {}
    }
  }
</script>