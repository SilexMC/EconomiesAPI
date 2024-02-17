<h3 align="center"> <samp>⚙️ GRADLE</samp> </h3>

```kotlin
repositories {
    // JitPack
    maven("https://jitpack.io")
}

dependencies {
    // EconomiesAPI 
    compileOnly("com.github.SilexMC:EconomiesAPI:1.0.0")
}
```

<br />

<h3 align="center"> <samp>⚙️ MAVEN</samp> </h3>

```xml
<repositories>
    <!-- JitPack -->
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <!-- EconomiesAPI -->
    <dependency>
        <groupId>com.github.SilexMC</groupId>
        <artifactId>EconomiesAPI</artifactId>
        <version>1.0.0</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```

<br />

<h3 align="center"> <samp>🖥 EXAMPLE ON HOW TO USE</samp> </h3>

```java
import com.github.silexmc.economies.api.EconomiesAPI;

public class PluginClass extends JavaPlugin {
    private EconomiesAPI economyService;
    
    @Override
    public void onEnable() {
        if (!Bukkit.getPluginManager().isPluginEnabled("Economies")) {
            Bukkit.getPluginManager().disablePlugin(this);
            return;
        }

        RegisteredServiceProvider<EconomiesAPI> service = Bukkit.getServicesManager().getRegistration(EconomiesAPI.class);
        if (service == null) {
            Bukkit.getPluginManager().disablePlugin(this);
            return;
        }
        this.economyService = service.getProvider();
    }
}
```