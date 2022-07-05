import { createApp } from 'vue'
import App from './App.vue'
import 'bootstrap'
import 'bootstrap/dist/css/bootstrap.min.css'
import router from './router'

//const app = CreateApp (App)
//app.use (router)
//app.use(VueSidebarMenu)
createApp(App).use(router).mount('#app')
