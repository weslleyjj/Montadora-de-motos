import * as React from "react";
import jsonServerProvider from 'ra-data-json-server';
import { Admin, Resource, ListGuesser } from 'react-admin';
import {MotoCreate, MotoList, MotoEdit} from './moto';
import { MotorList, MotorEdit, MotorCreate } from './motor';
import {PecaList, PecaEdit, PecaCreate} from './Peca';

const dataProvider = jsonServerProvider('http://localhost:8080');
const App = () => (
    <Admin dataProvider={dataProvider}>
        <Resource name="moto" list={MotoList} edit={MotoEdit} create={MotoCreate}/>
        <Resource name="motor" list={MotorList} edit={MotorEdit} create={MotorCreate}/>
        <Resource name="peca" list={PecaList} edit={PecaEdit} create={PecaCreate} />
        <Resource name="peca/peca-motor" list={ListGuesser} />
    </Admin>
);

export default App;